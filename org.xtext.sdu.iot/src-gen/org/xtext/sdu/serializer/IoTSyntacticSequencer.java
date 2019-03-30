/*
 * generated by Xtext 2.17.0
 */
package org.xtext.sdu.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.sdu.services.IoTGrammarAccess;

@SuppressWarnings("all")
public class IoTSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IoTGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FetchDataCondition_IfKeyword_0_1_or_WhenKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IoTGrammarAccess) access;
		match_FetchDataCondition_IfKeyword_0_1_or_WhenKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFetchDataConditionAccess().getIfKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getFetchDataConditionAccess().getWhenKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_FetchDataCondition_IfKeyword_0_1_or_WhenKeyword_0_0.equals(syntax))
				emit_FetchDataCondition_IfKeyword_0_1_or_WhenKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'when' | 'if'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) condition=Condition
	 */
	protected void emit_FetchDataCondition_IfKeyword_0_1_or_WhenKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}