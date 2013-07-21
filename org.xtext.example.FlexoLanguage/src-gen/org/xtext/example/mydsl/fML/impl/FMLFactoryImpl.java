/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.fML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FMLFactoryImpl extends EFactoryImpl implements FMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMLFactory init()
  {
    try
    {
      FMLFactory theFMLFactory = (FMLFactory)EPackage.Registry.INSTANCE.getEFactory(FMLPackage.eNS_URI);
      if (theFMLFactory != null)
      {
        return theFMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FMLPackage.VIEW_DEF: return createViewDef();
      case FMLPackage.VIRTUAL_MODEL: return createVirtualModel();
      case FMLPackage.MODEL_SLOT: return createModelSlot();
      case FMLPackage.EDITION_PATTERN: return createEditionPattern();
      case FMLPackage.PATTERN_ROLE: return createPatternRole();
      case FMLPackage.EDITION_SCHEME: return createEditionScheme();
      case FMLPackage.PARAMETER: return createParameter();
      case FMLPackage.EDITION_ACTION: return createEditionAction();
      case FMLPackage.BUILT_IN_ACTION: return createBuiltInAction();
      case FMLPackage.DECLARE_PATTERN_ROLE: return createDeclarePatternRole();
      case FMLPackage.DELETE_ACTION: return createDeleteAction();
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL: return createAddEMFObjectIndividual();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FMLPackage.EDITION_SCHEME_TYPE:
        return createEditionSchemeTypeFromString(eDataType, initialValue);
      case FMLPackage.MSTYPE:
        return createMSTYPEFromString(eDataType, initialValue);
      case FMLPackage.VMTYPE:
        return createVMTYPEFromString(eDataType, initialValue);
      case FMLPackage.PRTYPE:
        return createPRTYPEFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FMLPackage.EDITION_SCHEME_TYPE:
        return convertEditionSchemeTypeToString(eDataType, instanceValue);
      case FMLPackage.MSTYPE:
        return convertMSTYPEToString(eDataType, instanceValue);
      case FMLPackage.VMTYPE:
        return convertVMTYPEToString(eDataType, instanceValue);
      case FMLPackage.PRTYPE:
        return convertPRTYPEToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewDef createViewDef()
  {
    ViewDefImpl viewDef = new ViewDefImpl();
    return viewDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualModel createVirtualModel()
  {
    VirtualModelImpl virtualModel = new VirtualModelImpl();
    return virtualModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelSlot createModelSlot()
  {
    ModelSlotImpl modelSlot = new ModelSlotImpl();
    return modelSlot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionPattern createEditionPattern()
  {
    EditionPatternImpl editionPattern = new EditionPatternImpl();
    return editionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternRole createPatternRole()
  {
    PatternRoleImpl patternRole = new PatternRoleImpl();
    return patternRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionScheme createEditionScheme()
  {
    EditionSchemeImpl editionScheme = new EditionSchemeImpl();
    return editionScheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionAction createEditionAction()
  {
    EditionActionImpl editionAction = new EditionActionImpl();
    return editionAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInAction createBuiltInAction()
  {
    BuiltInActionImpl builtInAction = new BuiltInActionImpl();
    return builtInAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarePatternRole createDeclarePatternRole()
  {
    DeclarePatternRoleImpl declarePatternRole = new DeclarePatternRoleImpl();
    return declarePatternRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteAction createDeleteAction()
  {
    DeleteActionImpl deleteAction = new DeleteActionImpl();
    return deleteAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddEMFObjectIndividual createAddEMFObjectIndividual()
  {
    AddEMFObjectIndividualImpl addEMFObjectIndividual = new AddEMFObjectIndividualImpl();
    return addEMFObjectIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionSchemeType createEditionSchemeTypeFromString(EDataType eDataType, String initialValue)
  {
    EditionSchemeType result = EditionSchemeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEditionSchemeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MSTYPE createMSTYPEFromString(EDataType eDataType, String initialValue)
  {
    MSTYPE result = MSTYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMSTYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMTYPE createVMTYPEFromString(EDataType eDataType, String initialValue)
  {
    VMTYPE result = VMTYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVMTYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PRTYPE createPRTYPEFromString(EDataType eDataType, String initialValue)
  {
    PRTYPE result = PRTYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPRTYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMLPackage getFMLPackage()
  {
    return (FMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FMLPackage getPackage()
  {
    return FMLPackage.eINSTANCE;
  }

} //FMLFactoryImpl
