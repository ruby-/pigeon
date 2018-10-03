/*
 * PIGEON
 * Copyright 2018 Univeristy of Texas at Arlington
 *
 * Modified from Sparrow - University of California, Berkeley
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.utarlington.pigeon.daemon.util;

import edu.utarlington.pigeon.thrift.BackendService;
import edu.utarlington.pigeon.thrift.GetTaskService;
import edu.utarlington.pigeon.thrift.NodeMonitorService;
import org.apache.log4j.Logger;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Wrapper class for launching various thrift services clients for Pigeon
 *
 * @author ruby_
 * @create 2018-10-02-4:53 PM
 */

public class TClients {
    private final static Logger LOG = Logger.getLogger(TClients.class);

    //=======================================
    // Node monitor services clients
    //=======================================
    public static NodeMonitorService.Client createBlockingNmClient(String host, int port)
        throws IOException {
        return createBlockingNmClient(host, port, 0);
    }

    public static NodeMonitorService.Client createBlockingNmClient(String host, int port,
                                                                   int timeout)
            throws IOException {
        TTransport tr = new TFramedTransport(new TSocket(host, port, timeout));
        try {
            tr.open();
        } catch (TTransportException e) {
            LOG.warn("Error creating node monitor client to " + host + ":" + port);
            throw new IOException(e);
        }
        TProtocol proto = new TBinaryProtocol(tr);
        NodeMonitorService.Client client = new NodeMonitorService.Client(proto);
        return client;
    }


    //=======================================
    // GetTask services clients
    //=======================================
    public static GetTaskService.Client createBlockingGetTaskClient(
            String host, int port) throws IOException {
        return createBlockingGetTaskClient(host, port, 0);
    }

    public static GetTaskService.Client createBlockingGetTaskClient(
            String host, int port, int timeout) throws IOException {
        TTransport tr = new TFramedTransport(new TSocket(host, port, timeout));
        try {
            tr.open();
        } catch (TTransportException e) {
            LOG.warn("Error creating scheduler client to " + host + ":" + port);
            throw new IOException(e);
        }
        TProtocol proto = new TBinaryProtocol(tr);
        GetTaskService.Client client = new GetTaskService.Client(proto);
        return client;
    }

    //=======================================
    // Backend services clients
    //=======================================
    public static BackendService.Client createBlockingBackendClient(
            InetSocketAddress socket) throws IOException {
        return createBlockingBackendClient(socket.getAddress().getHostAddress(), socket.getPort());
    }

    public static BackendService.Client createBlockingBackendClient(
            String host, int port) throws IOException {
        TTransport tr = new TFramedTransport(new TSocket(host, port));
        try {
            tr.open();
        } catch (TTransportException e) {
            LOG.warn("Error creating backend client to " + host + ":" + port);
            throw new IOException(e);
        }
        TProtocol proto = new TBinaryProtocol(tr);
        BackendService.Client client = new BackendService.Client(proto);
        return client;
    }
}
