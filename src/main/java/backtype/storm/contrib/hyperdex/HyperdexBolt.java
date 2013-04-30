package backtype.storm.contrib.hyperdex;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import hyperclient.*;

import java.util.Map;

public class HyperdexBolt extends BaseRichBolt {
    private static Logger LOGGER = LoggerFactory.getLogger(HyperdexBolt.class);

    private OutputCollector collector;

    private transient HyperClient hyperClient = new HyperClient("127.0.0.1", 1982);

    @Override
    public void execute(Tuple input) {
        LOGGER.debug("Tuple received. Sending JMS message.");
    }

    @Override
    public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
        LOGGER.debug("Connecting to Hyperdex");
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
        throw new UnsupportedOperationException();
    }
}
