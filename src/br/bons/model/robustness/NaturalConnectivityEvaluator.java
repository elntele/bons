package br.bons.model.robustness;

import br.bons.core.INetwork;
import br.bons.core.NetworkProfile;
import br.bons.model.INetworkEvaluator;
import br.bons.model.NumericalResult;
import br.bons.model.TNetworkIndicator;
import br.cns.TMetric;

public class NaturalConnectivityEvaluator implements INetworkEvaluator<INetwork, NumericalResult> {

	@Override
	public NumericalResult evaluate(INetwork network) {
		return new NumericalResult(TNetworkIndicator.NATURAL_CONNECTIVITY,
				((NetworkProfile) network).getCn().getMetricValues().get(TMetric.NATURAL_CONNECTIVITY));
	}

}
