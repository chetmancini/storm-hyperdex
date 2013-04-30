package backtype.storm.contrib.hyperdex;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import hyperclient.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


@SuppressWarnings("serial")
public class HyperdexSpout extends BaseRichSpout {

    private static final Logger LOGGER = LoggerFactory.getLogger(HyperdexSpout.class);

    private SpoutOutputCollector spoutOutputCollector;

    private transient HyperClient hyperClient = new HyperClient("127.0.0.1", 1982);

    @Override
    public void open(Map conf, TopologyContext context, SpoutOutputCollector spoutOutputCollector) {
        this.spoutOutputCollector = spoutOutputCollector;
    }

    @Override
    public void nextTuple() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
        outputFieldsDeclarer.declare(new Fields("none"));
        throw new UnsupportedOperationException();
    }
}
