/**
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.socrates.util;

import lu.snt.socrates.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lu.snt.socrates.SocratesPackage
 * @generated
 */
public class SocratesAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SocratesPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SocratesAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SocratesPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SocratesSwitch<Adapter> modelSwitch =
    new SocratesSwitch<Adapter>()
    {
      @Override
      public Adapter caseSocrates(Socrates object)
      {
        return createSocratesAdapter();
      }
      @Override
      public Adapter caseOracle(Oracle object)
      {
        return createOracleAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseSignalsdefinition(Signalsdefinition object)
      {
        return createSignalsdefinitionAdapter();
      }
      @Override
      public Adapter caseConstantsDefinition(ConstantsDefinition object)
      {
        return createConstantsDefinitionAdapter();
      }
      @Override
      public Adapter caseConstantDefinition(ConstantDefinition object)
      {
        return createConstantDefinitionAdapter();
      }
      @Override
      public Adapter caseSignalID(SignalID object)
      {
        return createSignalIDAdapter();
      }
      @Override
      public Adapter caseConstantId(ConstantId object)
      {
        return createConstantIdAdapter();
      }
      @Override
      public Adapter caseTvariable(Tvariable object)
      {
        return createTvariableAdapter();
      }
      @Override
      public Adapter casenegationformula(negationformula object)
      {
        return createnegationformulaAdapter();
      }
      @Override
      public Adapter caseforAllformula(forAllformula object)
      {
        return createforAllformulaAdapter();
      }
      @Override
      public Adapter caseexistsformula(existsformula object)
      {
        return createexistsformulaAdapter();
      }
      @Override
      public Adapter caseformula(formula object)
      {
        return createformulaAdapter();
      }
      @Override
      public Adapter caseformulab(formulab object)
      {
        return createformulabAdapter();
      }
      @Override
      public Adapter caseformulabprime(formulabprime object)
      {
        return createformulabprimeAdapter();
      }
      @Override
      public Adapter caseterm(term object)
      {
        return createtermAdapter();
      }
      @Override
      public Adapter casetermprime(termprime object)
      {
        return createtermprimeAdapter();
      }
      @Override
      public Adapter caseexpression(expression object)
      {
        return createexpressionAdapter();
      }
      @Override
      public Adapter caseexpressionb(expressionb object)
      {
        return createexpressionbAdapter();
      }
      @Override
      public Adapter caseexpressionprime(expressionprime object)
      {
        return createexpressionprimeAdapter();
      }
      @Override
      public Adapter caseexpressionterm(expressionterm object)
      {
        return createexpressiontermAdapter();
      }
      @Override
      public Adapter caseexpressiontermprime(expressiontermprime object)
      {
        return createexpressiontermprimeAdapter();
      }
      @Override
      public Adapter caseExpressionAtom(ExpressionAtom object)
      {
        return createExpressionAtomAdapter();
      }
      @Override
      public Adapter caseBasicexpression(Basicexpression object)
      {
        return createBasicexpressionAdapter();
      }
      @Override
      public Adapter casebasicformulae(basicformulae object)
      {
        return createbasicformulaeAdapter();
      }
      @Override
      public Adapter caseboundterm(boundterm object)
      {
        return createboundtermAdapter();
      }
      @Override
      public Adapter casetimedterm(timedterm object)
      {
        return createtimedtermAdapter();
      }
      @Override
      public Adapter caseatom(atom object)
      {
        return createatomAdapter();
      }
      @Override
      public Adapter casevalue(value object)
      {
        return createvalueAdapter();
      }
      @Override
      public Adapter caseSignal(Signal object)
      {
        return createSignalAdapter();
      }
      @Override
      public Adapter caseAbsEXP(AbsEXP object)
      {
        return createAbsEXPAdapter();
      }
      @Override
      public Adapter caseNormexp(Normexp object)
      {
        return createNormexpAdapter();
      }
      @Override
      public Adapter caseSin(Sin object)
      {
        return createSinAdapter();
      }
      @Override
      public Adapter caseCos(Cos object)
      {
        return createCosAdapter();
      }
      @Override
      public Adapter caseSqrt(Sqrt object)
      {
        return createSqrtAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Socrates <em>Socrates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Socrates
   * @generated
   */
  public Adapter createSocratesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Oracle <em>Oracle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Oracle
   * @generated
   */
  public Adapter createOracleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Signalsdefinition <em>Signalsdefinition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Signalsdefinition
   * @generated
   */
  public Adapter createSignalsdefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.ConstantsDefinition <em>Constants Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.ConstantsDefinition
   * @generated
   */
  public Adapter createConstantsDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.ConstantDefinition
   * @generated
   */
  public Adapter createConstantDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.SignalID <em>Signal ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.SignalID
   * @generated
   */
  public Adapter createSignalIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.ConstantId <em>Constant Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.ConstantId
   * @generated
   */
  public Adapter createConstantIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Tvariable <em>Tvariable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Tvariable
   * @generated
   */
  public Adapter createTvariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.negationformula <em>negationformula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.negationformula
   * @generated
   */
  public Adapter createnegationformulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.forAllformula <em>for Allformula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.forAllformula
   * @generated
   */
  public Adapter createforAllformulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.existsformula <em>existsformula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.existsformula
   * @generated
   */
  public Adapter createexistsformulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.formula <em>formula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.formula
   * @generated
   */
  public Adapter createformulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.formulab <em>formulab</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.formulab
   * @generated
   */
  public Adapter createformulabAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.formulabprime <em>formulabprime</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.formulabprime
   * @generated
   */
  public Adapter createformulabprimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.term
   * @generated
   */
  public Adapter createtermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.termprime <em>termprime</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.termprime
   * @generated
   */
  public Adapter createtermprimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.expression
   * @generated
   */
  public Adapter createexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.expressionb <em>expressionb</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.expressionb
   * @generated
   */
  public Adapter createexpressionbAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.expressionprime <em>expressionprime</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.expressionprime
   * @generated
   */
  public Adapter createexpressionprimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.expressionterm <em>expressionterm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.expressionterm
   * @generated
   */
  public Adapter createexpressiontermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.expressiontermprime <em>expressiontermprime</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.expressiontermprime
   * @generated
   */
  public Adapter createexpressiontermprimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.ExpressionAtom <em>Expression Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.ExpressionAtom
   * @generated
   */
  public Adapter createExpressionAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Basicexpression <em>Basicexpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Basicexpression
   * @generated
   */
  public Adapter createBasicexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.basicformulae <em>basicformulae</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.basicformulae
   * @generated
   */
  public Adapter createbasicformulaeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.boundterm <em>boundterm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.boundterm
   * @generated
   */
  public Adapter createboundtermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.timedterm <em>timedterm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.timedterm
   * @generated
   */
  public Adapter createtimedtermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.atom <em>atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.atom
   * @generated
   */
  public Adapter createatomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.value <em>value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.value
   * @generated
   */
  public Adapter createvalueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Signal
   * @generated
   */
  public Adapter createSignalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.AbsEXP <em>Abs EXP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.AbsEXP
   * @generated
   */
  public Adapter createAbsEXPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Normexp <em>Normexp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Normexp
   * @generated
   */
  public Adapter createNormexpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Sin <em>Sin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Sin
   * @generated
   */
  public Adapter createSinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Cos <em>Cos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Cos
   * @generated
   */
  public Adapter createCosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.snt.socrates.Sqrt <em>Sqrt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.snt.socrates.Sqrt
   * @generated
   */
  public Adapter createSqrtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SocratesAdapterFactory
