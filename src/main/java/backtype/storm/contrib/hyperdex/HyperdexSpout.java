package backtype.storm.contrib.hyperdex;

import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;
import backtype.storm.topology.base.BaseRichSpout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SuppressWarnings("serial")
public class HyperdexSpout extends BaseRichSpout {

    private static final Logger LOGGER = LoggerFactory.getLogger(HyperdexSpout.class);

    private SpoutOutputCollector spoutOutputCollector;

    public void open(Map conf, TopologyContext context, SpoutOutputCollector spoutOutputCollector) {
        this.spoutOutputCollector = spoutOutputCollector;
    }

    public void nextTuple() {
    
    }
}
