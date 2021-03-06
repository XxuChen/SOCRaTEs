/*
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import lu.snt.ide.contentassist.antlr.internal.InternalSocratesParser;
import lu.snt.services.SocratesGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SocratesParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SocratesGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SocratesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFormulaAccess().getAlternatives(), "rule__Formula__Alternatives");
			builder.put(grammarAccess.getFormulabprimeAccess().getOpAlternatives_0_0(), "rule__Formulabprime__OpAlternatives_0_0");
			builder.put(grammarAccess.getExpressionbAccess().getAlternatives(), "rule__Expressionb__Alternatives");
			builder.put(grammarAccess.getExpressionprimeAccess().getOpAlternatives_0_0(), "rule__Expressionprime__OpAlternatives_0_0");
			builder.put(grammarAccess.getExpressiontermAccess().getTermAlternatives_0_0(), "rule__Expressionterm__TermAlternatives_0_0");
			builder.put(grammarAccess.getExpressiontermprimeAccess().getOpAlternatives_0_0(), "rule__Expressiontermprime__OpAlternatives_0_0");
			builder.put(grammarAccess.getExpressionAtomAccess().getAlternatives(), "rule__ExpressionAtom__Alternatives");
			builder.put(grammarAccess.getBasicexpressionAccess().getAlternatives(), "rule__Basicexpression__Alternatives");
			builder.put(grammarAccess.getBasicformulaeAccess().getAlternatives(), "rule__Basicformulae__Alternatives");
			builder.put(grammarAccess.getBoundtermAccess().getAlternatives_2(), "rule__Boundterm__Alternatives_2");
			builder.put(grammarAccess.getBoundtermAccess().getAlternatives_6(), "rule__Boundterm__Alternatives_6");
			builder.put(grammarAccess.getTimedtermAccess().getAlternatives(), "rule__Timedterm__Alternatives");
			builder.put(grammarAccess.getTimedtermAccess().getAlternatives_2_0(), "rule__Timedterm__Alternatives_2_0");
			builder.put(grammarAccess.getTimedtermAccess().getOpAlternatives_2_1_0_0(), "rule__Timedterm__OpAlternatives_2_1_0_0");
			builder.put(grammarAccess.getAtomAccess().getAlternatives(), "rule__Atom__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getSignalAccess().getAlternatives(), "rule__Signal__Alternatives");
			builder.put(grammarAccess.getBin_connectiveAccess().getAlternatives(), "rule__Bin_connective__Alternatives");
			builder.put(grammarAccess.getPATHAccess().getAlternatives_0(), "rule__PATH__Alternatives_0");
			builder.put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
			builder.put(grammarAccess.getRELOPAccess().getAlternatives(), "rule__RELOP__Alternatives");
			builder.put(grammarAccess.getSIGNAccess().getAlternatives(), "rule__SIGN__Alternatives");
			builder.put(grammarAccess.getOPAccess().getAlternatives(), "rule__OP__Alternatives");
			builder.put(grammarAccess.getOracleAccess().getGroup(), "rule__Oracle__Group__0");
			builder.put(grammarAccess.getOracleAccess().getGroup_4(), "rule__Oracle__Group_4__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
			builder.put(grammarAccess.getReqIdAccess().getGroup(), "rule__ReqId__Group__0");
			builder.put(grammarAccess.getReqIdAccess().getGroup_1(), "rule__ReqId__Group_1__0");
			builder.put(grammarAccess.getReqIdAccess().getGroup_1_2(), "rule__ReqId__Group_1_2__0");
			builder.put(grammarAccess.getSignalsdefinitionAccess().getGroup(), "rule__Signalsdefinition__Group__0");
			builder.put(grammarAccess.getSignalsdefinitionAccess().getGroup_2(), "rule__Signalsdefinition__Group_2__0");
			builder.put(grammarAccess.getConstantsDefinitionAccess().getGroup(), "rule__ConstantsDefinition__Group__0");
			builder.put(grammarAccess.getConstantsDefinitionAccess().getGroup_2(), "rule__ConstantsDefinition__Group_2__0");
			builder.put(grammarAccess.getConstantDefinitionAccess().getGroup(), "rule__ConstantDefinition__Group__0");
			builder.put(grammarAccess.getNegationformulaAccess().getGroup(), "rule__Negationformula__Group__0");
			builder.put(grammarAccess.getForAllformulaAccess().getGroup(), "rule__ForAllformula__Group__0");
			builder.put(grammarAccess.getExistsformulaAccess().getGroup(), "rule__Existsformula__Group__0");
			builder.put(grammarAccess.getFormulabAccess().getGroup(), "rule__Formulab__Group__0");
			builder.put(grammarAccess.getFormulabprimeAccess().getGroup(), "rule__Formulabprime__Group__0");
			builder.put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
			builder.put(grammarAccess.getTermprimeAccess().getGroup(), "rule__Termprime__Group__0");
			builder.put(grammarAccess.getExpressionbAccess().getGroup_0(), "rule__Expressionb__Group_0__0");
			builder.put(grammarAccess.getExpressionbAccess().getGroup_1(), "rule__Expressionb__Group_1__0");
			builder.put(grammarAccess.getExpressionprimeAccess().getGroup(), "rule__Expressionprime__Group__0");
			builder.put(grammarAccess.getExpressiontermAccess().getGroup(), "rule__Expressionterm__Group__0");
			builder.put(grammarAccess.getExpressiontermprimeAccess().getGroup(), "rule__Expressiontermprime__Group__0");
			builder.put(grammarAccess.getExpressionAtomAccess().getGroup_1(), "rule__ExpressionAtom__Group_1__0");
			builder.put(grammarAccess.getExpressionAtomAccess().getGroup_2(), "rule__ExpressionAtom__Group_2__0");
			builder.put(grammarAccess.getBasicexpressionAccess().getGroup_0(), "rule__Basicexpression__Group_0__0");
			builder.put(grammarAccess.getBoundtermAccess().getGroup(), "rule__Boundterm__Group__0");
			builder.put(grammarAccess.getTimedtermAccess().getGroup_2(), "rule__Timedterm__Group_2__0");
			builder.put(grammarAccess.getTimedtermAccess().getGroup_2_1(), "rule__Timedterm__Group_2_1__0");
			builder.put(grammarAccess.getAtomAccess().getGroup_0(), "rule__Atom__Group_0__0");
			builder.put(grammarAccess.getAtomAccess().getGroup_1(), "rule__Atom__Group_1__0");
			builder.put(grammarAccess.getValueAccess().getGroup_0(), "rule__Value__Group_0__0");
			builder.put(grammarAccess.getSignalAccess().getGroup_0(), "rule__Signal__Group_0__0");
			builder.put(grammarAccess.getSignalAccess().getGroup_1(), "rule__Signal__Group_1__0");
			builder.put(grammarAccess.getSignalAccess().getGroup_2(), "rule__Signal__Group_2__0");
			builder.put(grammarAccess.getAbsEXPAccess().getGroup(), "rule__AbsEXP__Group__0");
			builder.put(grammarAccess.getNormexpAccess().getGroup(), "rule__Normexp__Group__0");
			builder.put(grammarAccess.getSinAccess().getGroup(), "rule__Sin__Group__0");
			builder.put(grammarAccess.getCosAccess().getGroup(), "rule__Cos__Group__0");
			builder.put(grammarAccess.getSqrtAccess().getGroup(), "rule__Sqrt__Group__0");
			builder.put(grammarAccess.getFLOATAccess().getGroup(), "rule__FLOAT__Group__0");
			builder.put(grammarAccess.getPATHAccess().getGroup(), "rule__PATH__Group__0");
			builder.put(grammarAccess.getPATHAccess().getGroup_1(), "rule__PATH__Group_1__0");
			builder.put(grammarAccess.getSocratesAccess().getOraclesAssignment(), "rule__Socrates__OraclesAssignment");
			builder.put(grammarAccess.getOracleAccess().getModelNameAssignment_2(), "rule__Oracle__ModelNameAssignment_2");
			builder.put(grammarAccess.getOracleAccess().getPathAssignment_4_1(), "rule__Oracle__PathAssignment_4_1");
			builder.put(grammarAccess.getOracleAccess().getReqnameAssignment_6(), "rule__Oracle__ReqnameAssignment_6");
			builder.put(grammarAccess.getOracleAccess().getSigndefAssignment_8(), "rule__Oracle__SigndefAssignment_8");
			builder.put(grammarAccess.getOracleAccess().getConstantDefinitionsAssignment_9(), "rule__Oracle__ConstantDefinitionsAssignment_9");
			builder.put(grammarAccess.getOracleAccess().getRequirementAssignment_10(), "rule__Oracle__RequirementAssignment_10");
			builder.put(grammarAccess.getRequirementAccess().getFormulaAssignment_4(), "rule__Requirement__FormulaAssignment_4");
			builder.put(grammarAccess.getSignalsdefinitionAccess().getSignalsAssignment_1(), "rule__Signalsdefinition__SignalsAssignment_1");
			builder.put(grammarAccess.getSignalsdefinitionAccess().getSignalsAssignment_2_1(), "rule__Signalsdefinition__SignalsAssignment_2_1");
			builder.put(grammarAccess.getConstantsDefinitionAccess().getConstantsAssignment_1(), "rule__ConstantsDefinition__ConstantsAssignment_1");
			builder.put(grammarAccess.getConstantsDefinitionAccess().getConstantsAssignment_2_1(), "rule__ConstantsDefinition__ConstantsAssignment_2_1");
			builder.put(grammarAccess.getConstantDefinitionAccess().getConstantidAssignment_0(), "rule__ConstantDefinition__ConstantidAssignment_0");
			builder.put(grammarAccess.getConstantDefinitionAccess().getValueAssignment_3(), "rule__ConstantDefinition__ValueAssignment_3");
			builder.put(grammarAccess.getSignalIDAccess().getNameAssignment(), "rule__SignalID__NameAssignment");
			builder.put(grammarAccess.getConstantIdAccess().getNameAssignment(), "rule__ConstantId__NameAssignment");
			builder.put(grammarAccess.getTvariableAccess().getNameAssignment(), "rule__Tvariable__NameAssignment");
			builder.put(grammarAccess.getNegationformulaAccess().getNegationchildAssignment_1(), "rule__Negationformula__NegationchildAssignment_1");
			builder.put(grammarAccess.getForAllformulaAccess().getBoundAssignment_1(), "rule__ForAllformula__BoundAssignment_1");
			builder.put(grammarAccess.getForAllformulaAccess().getForallchildAssignment_4(), "rule__ForAllformula__ForallchildAssignment_4");
			builder.put(grammarAccess.getExistsformulaAccess().getBoundAssignment_1(), "rule__Existsformula__BoundAssignment_1");
			builder.put(grammarAccess.getExistsformulaAccess().getExistschildAssignment_4(), "rule__Existsformula__ExistschildAssignment_4");
			builder.put(grammarAccess.getFormulaAccess().getFAssignment_0(), "rule__Formula__FAssignment_0");
			builder.put(grammarAccess.getFormulaAccess().getFAssignment_1(), "rule__Formula__FAssignment_1");
			builder.put(grammarAccess.getFormulabAccess().getAAssignment_0(), "rule__Formulab__AAssignment_0");
			builder.put(grammarAccess.getFormulabAccess().getTAssignment_1(), "rule__Formulab__TAssignment_1");
			builder.put(grammarAccess.getFormulabprimeAccess().getOpAssignment_0(), "rule__Formulabprime__OpAssignment_0");
			builder.put(grammarAccess.getFormulabprimeAccess().getT2Assignment_1(), "rule__Formulabprime__T2Assignment_1");
			builder.put(grammarAccess.getFormulabprimeAccess().getFAssignment_2(), "rule__Formulabprime__FAssignment_2");
			builder.put(grammarAccess.getTermAccess().getAAssignment_0(), "rule__Term__AAssignment_0");
			builder.put(grammarAccess.getTermAccess().getTAssignment_1(), "rule__Term__TAssignment_1");
			builder.put(grammarAccess.getTermprimeAccess().getOpAssignment_0(), "rule__Termprime__OpAssignment_0");
			builder.put(grammarAccess.getTermprimeAccess().getTAssignment_1(), "rule__Termprime__TAssignment_1");
			builder.put(grammarAccess.getTermprimeAccess().getF1Assignment_2(), "rule__Termprime__F1Assignment_2");
			builder.put(grammarAccess.getExpressionAccess().getExpbAssignment(), "rule__Expression__ExpbAssignment");
			builder.put(grammarAccess.getExpressionbAccess().getTermAssignment_0_0(), "rule__Expressionb__TermAssignment_0_0");
			builder.put(grammarAccess.getExpressionbAccess().getExpprimeAssignment_0_1(), "rule__Expressionb__ExpprimeAssignment_0_1");
			builder.put(grammarAccess.getExpressionbAccess().getTermAssignment_1_1(), "rule__Expressionb__TermAssignment_1_1");
			builder.put(grammarAccess.getExpressionbAccess().getExpprimeAssignment_1_3(), "rule__Expressionb__ExpprimeAssignment_1_3");
			builder.put(grammarAccess.getExpressionprimeAccess().getOpAssignment_0(), "rule__Expressionprime__OpAssignment_0");
			builder.put(grammarAccess.getExpressionprimeAccess().getT2Assignment_1(), "rule__Expressionprime__T2Assignment_1");
			builder.put(grammarAccess.getExpressionprimeAccess().getFAssignment_2(), "rule__Expressionprime__FAssignment_2");
			builder.put(grammarAccess.getExpressiontermAccess().getTermAssignment_0(), "rule__Expressionterm__TermAssignment_0");
			builder.put(grammarAccess.getExpressiontermAccess().getExpprimeAssignment_1(), "rule__Expressionterm__ExpprimeAssignment_1");
			builder.put(grammarAccess.getExpressiontermprimeAccess().getOpAssignment_0(), "rule__Expressiontermprime__OpAssignment_0");
			builder.put(grammarAccess.getExpressiontermprimeAccess().getT2Assignment_1(), "rule__Expressiontermprime__T2Assignment_1");
			builder.put(grammarAccess.getExpressiontermprimeAccess().getFAssignment_2(), "rule__Expressiontermprime__FAssignment_2");
			builder.put(grammarAccess.getExpressionAtomAccess().getExpAssignment_0(), "rule__ExpressionAtom__ExpAssignment_0");
			builder.put(grammarAccess.getExpressionAtomAccess().getExpAssignment_1_1(), "rule__ExpressionAtom__ExpAssignment_1_1");
			builder.put(grammarAccess.getExpressionAtomAccess().getOpAssignment_2_0(), "rule__ExpressionAtom__OpAssignment_2_0");
			builder.put(grammarAccess.getExpressionAtomAccess().getExpAssignment_2_1(), "rule__ExpressionAtom__ExpAssignment_2_1");
			builder.put(grammarAccess.getExpressionAtomAccess().getExpAssignment_3(), "rule__ExpressionAtom__ExpAssignment_3");
			builder.put(grammarAccess.getBasicexpressionAccess().getExpAssignment_0_1(), "rule__Basicexpression__ExpAssignment_0_1");
			builder.put(grammarAccess.getBasicexpressionAccess().getExpAssignment_1(), "rule__Basicexpression__ExpAssignment_1");
			builder.put(grammarAccess.getBasicexpressionAccess().getExpAssignment_2(), "rule__Basicexpression__ExpAssignment_2");
			builder.put(grammarAccess.getBasicexpressionAccess().getExpAssignment_3(), "rule__Basicexpression__ExpAssignment_3");
			builder.put(grammarAccess.getBasicexpressionAccess().getExpAssignment_4(), "rule__Basicexpression__ExpAssignment_4");
			builder.put(grammarAccess.getBasicexpressionAccess().getExpAssignment_5(), "rule__Basicexpression__ExpAssignment_5");
			builder.put(grammarAccess.getBasicformulaeAccess().getFAssignment_0(), "rule__Basicformulae__FAssignment_0");
			builder.put(grammarAccess.getBasicformulaeAccess().getFAssignment_1(), "rule__Basicformulae__FAssignment_1");
			builder.put(grammarAccess.getBasicformulaeAccess().getFAssignment_2(), "rule__Basicformulae__FAssignment_2");
			builder.put(grammarAccess.getBoundtermAccess().getRefAssignment_0(), "rule__Boundterm__RefAssignment_0");
			builder.put(grammarAccess.getBoundtermAccess().getLAssignment_2_0(), "rule__Boundterm__LAssignment_2_0");
			builder.put(grammarAccess.getBoundtermAccess().getLAssignment_2_1(), "rule__Boundterm__LAssignment_2_1");
			builder.put(grammarAccess.getBoundtermAccess().getLeftboundAssignment_3(), "rule__Boundterm__LeftboundAssignment_3");
			builder.put(grammarAccess.getBoundtermAccess().getRightboundAssignment_5(), "rule__Boundterm__RightboundAssignment_5");
			builder.put(grammarAccess.getBoundtermAccess().getRAssignment_6_0(), "rule__Boundterm__RAssignment_6_0");
			builder.put(grammarAccess.getBoundtermAccess().getRAssignment_6_1(), "rule__Boundterm__RAssignment_6_1");
			builder.put(grammarAccess.getTimedtermAccess().getInfAssignment_0(), "rule__Timedterm__InfAssignment_0");
			builder.put(grammarAccess.getTimedtermAccess().getNumberAssignment_1(), "rule__Timedterm__NumberAssignment_1");
			builder.put(grammarAccess.getTimedtermAccess().getRefAssignment_2_0_0(), "rule__Timedterm__RefAssignment_2_0_0");
			builder.put(grammarAccess.getTimedtermAccess().getRefAssignment_2_0_1(), "rule__Timedterm__RefAssignment_2_0_1");
			builder.put(grammarAccess.getTimedtermAccess().getOpAssignment_2_1_0(), "rule__Timedterm__OpAssignment_2_1_0");
			builder.put(grammarAccess.getTimedtermAccess().getValueAssignment_2_1_1(), "rule__Timedterm__ValueAssignment_2_1_1");
			builder.put(grammarAccess.getAtomAccess().getFAssignment_0_1(), "rule__Atom__FAssignment_0_1");
			builder.put(grammarAccess.getAtomAccess().getS1Assignment_1_1(), "rule__Atom__S1Assignment_1_1");
			builder.put(grammarAccess.getAtomAccess().getOpAssignment_1_2(), "rule__Atom__OpAssignment_1_2");
			builder.put(grammarAccess.getAtomAccess().getS2Assignment_1_3(), "rule__Atom__S2Assignment_1_3");
			builder.put(grammarAccess.getValueAccess().getExpAssignment_0_1(), "rule__Value__ExpAssignment_0_1");
			builder.put(grammarAccess.getValueAccess().getNumberAssignment_1(), "rule__Value__NumberAssignment_1");
			builder.put(grammarAccess.getValueAccess().getRefAssignment_2(), "rule__Value__RefAssignment_2");
			builder.put(grammarAccess.getValueAccess().getFloatAssignment_3(), "rule__Value__FloatAssignment_3");
			builder.put(grammarAccess.getSignalAccess().getSignalidAssignment_0_0(), "rule__Signal__SignalidAssignment_0_0");
			builder.put(grammarAccess.getSignalAccess().getTimdedtermAssignment_0_2(), "rule__Signal__TimdedtermAssignment_0_2");
			builder.put(grammarAccess.getSignalAccess().getSignalidAssignment_1_0(), "rule__Signal__SignalidAssignment_1_0");
			builder.put(grammarAccess.getSignalAccess().getIndx1Assignment_1_2(), "rule__Signal__Indx1Assignment_1_2");
			builder.put(grammarAccess.getSignalAccess().getTimdedtermAssignment_1_5(), "rule__Signal__TimdedtermAssignment_1_5");
			builder.put(grammarAccess.getSignalAccess().getSignalidAssignment_2_0(), "rule__Signal__SignalidAssignment_2_0");
			builder.put(grammarAccess.getSignalAccess().getIndx1Assignment_2_2(), "rule__Signal__Indx1Assignment_2_2");
			builder.put(grammarAccess.getSignalAccess().getIndx2Assignment_2_5(), "rule__Signal__Indx2Assignment_2_5");
			builder.put(grammarAccess.getSignalAccess().getTimdedtermAssignment_2_8(), "rule__Signal__TimdedtermAssignment_2_8");
			builder.put(grammarAccess.getAbsEXPAccess().getExp1Assignment_1(), "rule__AbsEXP__Exp1Assignment_1");
			builder.put(grammarAccess.getNormexpAccess().getExp1Assignment_1(), "rule__Normexp__Exp1Assignment_1");
			builder.put(grammarAccess.getSinAccess().getExp1Assignment_2(), "rule__Sin__Exp1Assignment_2");
			builder.put(grammarAccess.getCosAccess().getExp1Assignment_2(), "rule__Cos__Exp1Assignment_2");
			builder.put(grammarAccess.getSqrtAccess().getExp1Assignment_2(), "rule__Sqrt__Exp1Assignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SocratesGrammarAccess grammarAccess;

	@Override
	protected InternalSocratesParser createParser() {
		InternalSocratesParser result = new InternalSocratesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SocratesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SocratesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
