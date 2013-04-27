package backtype.storm.contrib.hyperdex;

import backtype.storm.topology.base.BaseRichBolt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Tuple;

public class HyperdexBolt extends BaseRichBolt {
    private static Logger LOGGER = LoggerFactory.getLogger(HyperdexBolt.class);

    private OutputCollector collector;

    @Override
    public void execute(Tuple input) {
        LOGGER.debug("Tuple received. Sending JMS message.");
    }

    @Override
    public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
        LOGGER.debug("Connecting to Hyperdex");
    }
}
