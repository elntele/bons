package br.bons.model.performance;

import br.bons.core.CallSchedulerNonUniformHub;
import br.bons.core.INetwork;
import br.bons.core.NetworkProfile;
import br.bons.model.INetworkEvaluator;
import br.bons.model.NumericalResult;
import br.bons.model.TNetworkIndicator;
import br.bons.rwa.SimpleDijkstraSimulator;

public class BlockingProbabilityEstimator implements INetworkEvaluator<INetwork, NumericalResult> {
	private static final double MIN_BP = 0.000001;

	private SimpleDijkstraSimulator simulator;

	private int networkLoad;

	public BlockingProbabilityEstimator() {
		this(100);
	}

	public BlockingProbabilityEstimator(int networkLoad) {
		this.networkLoad = networkLoad;
		simulator = new SimpleDijkstraSimulator();
	}

	@Override
	public NumericalResult evaluate(INetwork net) {
		NetworkProfile profile = (NetworkProfile) net;

		simulator.simulate(profile, new CallSchedulerNonUniformHub(profile.getNodes().size(), networkLoad), 1000);

		return new NumericalResult(TNetworkIndicator.BLOCKING_PROBABILITY,
				profile.getBp().getTotal() < MIN_BP ? MIN_BP : profile.getBp().getTotal());
	}

}
