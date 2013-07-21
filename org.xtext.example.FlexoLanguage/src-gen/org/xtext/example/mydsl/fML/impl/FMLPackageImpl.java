/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.fML.AddEMFObjectIndividual;
import org.xtext.example.mydsl.fML.BuiltInAction;
import org.xtext.example.mydsl.fML.DeclarePatternRole;
import org.xtext.example.mydsl.fML.DeleteAction;
import org.xtext.example.mydsl.fML.EditionAction;
import org.xtext.example.mydsl.fML.EditionPattern;
import org.xtext.example.mydsl.fML.EditionScheme;
import org.xtext.example.mydsl.fML.EditionSchemeType;
import org.xtext.example.mydsl.fML.FMLFactory;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.ModelSlot;
import org.xtext.example.mydsl.fML.Parameter;
import org.xtext.example.mydsl.fML.PatternRole;
import org.xtext.example.mydsl.fML.ViewDef;
import org.xtext.example.mydsl.fML.VirtualModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FMLPackageImpl extends EPackageImpl implements FMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelSlotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editionPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editionSchemeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editionActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarePatternRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addEMFObjectIndividualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum editionSchemeTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mstypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum vmtypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum prtypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.fML.FMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FMLPackageImpl()
  {
    super(eNS_URI, FMLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FMLPackage init()
  {
    if (isInited) return (FMLPackage)EPackage.Registry.INSTANCE.getEPackage(FMLPackage.eNS_URI);

    // Obtain or create and register package
    FMLPackageImpl theFMLPackage = (FMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FMLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFMLPackage.createPackageContents();

    // Initialize created meta-data
    theFMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFMLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FMLPackage.eNS_URI, theFMLPackage);
    return theFMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewDef()
  {
    return viewDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewDef_Name()
  {
    return (EAttribute)viewDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewDef_Uri()
  {
    return (EAttribute)viewDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewDef_Elements()
  {
    return (EReference)viewDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualModel()
  {
    return virtualModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualModel_Name()
  {
    return (EAttribute)virtualModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualModel_Type()
  {
    return (EAttribute)virtualModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualModel_Uri()
  {
    return (EAttribute)virtualModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVirtualModel_ModelSlots()
  {
    return (EReference)virtualModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVirtualModel_EditionPatterns()
  {
    return (EReference)virtualModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelSlot()
  {
    return modelSlotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelSlot_Name()
  {
    return (EAttribute)modelSlotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelSlot_Type()
  {
    return (EAttribute)modelSlotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelSlot_Uri()
  {
    return (EAttribute)modelSlotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelSlot_Required()
  {
    return (EAttribute)modelSlotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelSlot_ReadOnly()
  {
    return (EAttribute)modelSlotEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditionPattern()
  {
    return editionPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditionPattern_Name()
  {
    return (EAttribute)editionPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditionPattern_SuperEditionPattern()
  {
    return (EReference)editionPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditionPattern_PatternRoles()
  {
    return (EReference)editionPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditionPattern_EditionSchemes()
  {
    return (EReference)editionPatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatternRole()
  {
    return patternRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatternRole_Name()
  {
    return (EAttribute)patternRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatternRole_Type()
  {
    return (EAttribute)patternRoleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatternRole_ModelElement()
  {
    return (EAttribute)patternRoleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatternRole_ModelSlot()
  {
    return (EReference)patternRoleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditionScheme()
  {
    return editionSchemeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditionScheme_EditionSchemeType()
  {
    return (EAttribute)editionSchemeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditionScheme_Name()
  {
    return (EAttribute)editionSchemeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditionScheme_Parameter()
  {
    return (EReference)editionSchemeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditionScheme_EditionAction()
  {
    return (EReference)editionSchemeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Widget()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_EditionPattern()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditionAction()
  {
    return editionActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInAction()
  {
    return builtInActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarePatternRole()
  {
    return declarePatternRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarePatternRole_PatternRole()
  {
    return (EReference)declarePatternRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarePatternRole_Parameter()
  {
    return (EReference)declarePatternRoleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarePatternRole_Add()
  {
    return (EReference)declarePatternRoleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteAction()
  {
    return deleteActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteAction_PatternRole()
  {
    return (EReference)deleteActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddEMFObjectIndividual()
  {
    return addEMFObjectIndividualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddEMFObjectIndividual_EditionPattern()
  {
    return (EReference)addEMFObjectIndividualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddEMFObjectIndividual_ModelSlot()
  {
    return (EReference)addEMFObjectIndividualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEditionSchemeType()
  {
    return editionSchemeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMSTYPE()
  {
    return mstypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVMTYPE()
  {
    return vmtypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPRTYPE()
  {
    return prtypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMLFactory getFMLFactory()
  {
    return (FMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    viewDefEClass = createEClass(VIEW_DEF);
    createEAttribute(viewDefEClass, VIEW_DEF__NAME);
    createEAttribute(viewDefEClass, VIEW_DEF__URI);
    createEReference(viewDefEClass, VIEW_DEF__ELEMENTS);

    virtualModelEClass = createEClass(VIRTUAL_MODEL);
    createEAttribute(virtualModelEClass, VIRTUAL_MODEL__NAME);
    createEAttribute(virtualModelEClass, VIRTUAL_MODEL__TYPE);
    createEAttribute(virtualModelEClass, VIRTUAL_MODEL__URI);
    createEReference(virtualModelEClass, VIRTUAL_MODEL__MODEL_SLOTS);
    createEReference(virtualModelEClass, VIRTUAL_MODEL__EDITION_PATTERNS);

    modelSlotEClass = createEClass(MODEL_SLOT);
    createEAttribute(modelSlotEClass, MODEL_SLOT__NAME);
    createEAttribute(modelSlotEClass, MODEL_SLOT__TYPE);
    createEAttribute(modelSlotEClass, MODEL_SLOT__URI);
    createEAttribute(modelSlotEClass, MODEL_SLOT__REQUIRED);
    createEAttribute(modelSlotEClass, MODEL_SLOT__READ_ONLY);

    editionPatternEClass = createEClass(EDITION_PATTERN);
    createEAttribute(editionPatternEClass, EDITION_PATTERN__NAME);
    createEReference(editionPatternEClass, EDITION_PATTERN__SUPER_EDITION_PATTERN);
    createEReference(editionPatternEClass, EDITION_PATTERN__PATTERN_ROLES);
    createEReference(editionPatternEClass, EDITION_PATTERN__EDITION_SCHEMES);

    patternRoleEClass = createEClass(PATTERN_ROLE);
    createEAttribute(patternRoleEClass, PATTERN_ROLE__NAME);
    createEAttribute(patternRoleEClass, PATTERN_ROLE__TYPE);
    createEAttribute(patternRoleEClass, PATTERN_ROLE__MODEL_ELEMENT);
    createEReference(patternRoleEClass, PATTERN_ROLE__MODEL_SLOT);

    editionSchemeEClass = createEClass(EDITION_SCHEME);
    createEAttribute(editionSchemeEClass, EDITION_SCHEME__EDITION_SCHEME_TYPE);
    createEAttribute(editionSchemeEClass, EDITION_SCHEME__NAME);
    createEReference(editionSchemeEClass, EDITION_SCHEME__PARAMETER);
    createEReference(editionSchemeEClass, EDITION_SCHEME__EDITION_ACTION);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__WIDGET);
    createEReference(parameterEClass, PARAMETER__EDITION_PATTERN);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    editionActionEClass = createEClass(EDITION_ACTION);

    builtInActionEClass = createEClass(BUILT_IN_ACTION);

    declarePatternRoleEClass = createEClass(DECLARE_PATTERN_ROLE);
    createEReference(declarePatternRoleEClass, DECLARE_PATTERN_ROLE__PATTERN_ROLE);
    createEReference(declarePatternRoleEClass, DECLARE_PATTERN_ROLE__PARAMETER);
    createEReference(declarePatternRoleEClass, DECLARE_PATTERN_ROLE__ADD);

    deleteActionEClass = createEClass(DELETE_ACTION);
    createEReference(deleteActionEClass, DELETE_ACTION__PATTERN_ROLE);

    addEMFObjectIndividualEClass = createEClass(ADD_EMF_OBJECT_INDIVIDUAL);
    createEReference(addEMFObjectIndividualEClass, ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN);
    createEReference(addEMFObjectIndividualEClass, ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT);

    // Create enums
    editionSchemeTypeEEnum = createEEnum(EDITION_SCHEME_TYPE);
    mstypeEEnum = createEEnum(MSTYPE);
    vmtypeEEnum = createEEnum(VMTYPE);
    prtypeEEnum = createEEnum(PRTYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    builtInActionEClass.getESuperTypes().add(this.getEditionAction());
    declarePatternRoleEClass.getESuperTypes().add(this.getBuiltInAction());
    deleteActionEClass.getESuperTypes().add(this.getBuiltInAction());
    addEMFObjectIndividualEClass.getESuperTypes().add(this.getBuiltInAction());

    // Initialize classes and features; add operations and parameters
    initEClass(viewDefEClass, ViewDef.class, "ViewDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewDef_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ViewDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewDef_Elements(), this.getVirtualModel(), null, "elements", null, 0, -1, ViewDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualModelEClass, VirtualModel.class, "VirtualModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirtualModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualModel_Type(), this.getVMTYPE(), "type", null, 0, 1, VirtualModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualModel_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, VirtualModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualModel_ModelSlots(), this.getModelSlot(), null, "ModelSlots", null, 0, -1, VirtualModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualModel_EditionPatterns(), this.getEditionPattern(), null, "EditionPatterns", null, 0, -1, VirtualModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelSlotEClass, ModelSlot.class, "ModelSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelSlot_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelSlot_Type(), this.getMSTYPE(), "type", null, 0, 1, ModelSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelSlot_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ModelSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelSlot_Required(), ecorePackage.getEString(), "required", null, 0, 1, ModelSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelSlot_ReadOnly(), ecorePackage.getEString(), "readOnly", null, 0, 1, ModelSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editionPatternEClass, EditionPattern.class, "EditionPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEditionPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1, EditionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditionPattern_SuperEditionPattern(), this.getEditionPattern(), null, "superEditionPattern", null, 0, 1, EditionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditionPattern_PatternRoles(), this.getPatternRole(), null, "patternRoles", null, 0, -1, EditionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditionPattern_EditionSchemes(), this.getEditionScheme(), null, "editionSchemes", null, 0, -1, EditionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternRoleEClass, PatternRole.class, "PatternRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPatternRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, PatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatternRole_Type(), this.getPRTYPE(), "type", null, 0, 1, PatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatternRole_ModelElement(), ecorePackage.getEString(), "modelElement", null, 0, 1, PatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPatternRole_ModelSlot(), this.getModelSlot(), null, "modelSlot", null, 0, 1, PatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editionSchemeEClass, EditionScheme.class, "EditionScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEditionScheme_EditionSchemeType(), this.getEditionSchemeType(), "editionSchemeType", null, 0, 1, EditionScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEditionScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, EditionScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditionScheme_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, EditionScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditionScheme_EditionAction(), this.getEditionAction(), null, "editionAction", null, 0, -1, EditionScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Widget(), this.getPRTYPE(), "widget", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_EditionPattern(), this.getEditionPattern(), null, "editionPattern", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editionActionEClass, EditionAction.class, "EditionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builtInActionEClass, BuiltInAction.class, "BuiltInAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(declarePatternRoleEClass, DeclarePatternRole.class, "DeclarePatternRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarePatternRole_PatternRole(), this.getPatternRole(), null, "patternRole", null, 0, -1, DeclarePatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarePatternRole_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, DeclarePatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarePatternRole_Add(), this.getAddEMFObjectIndividual(), null, "add", null, 0, -1, DeclarePatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteActionEClass, DeleteAction.class, "DeleteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeleteAction_PatternRole(), this.getPatternRole(), null, "patternRole", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addEMFObjectIndividualEClass, AddEMFObjectIndividual.class, "AddEMFObjectIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAddEMFObjectIndividual_EditionPattern(), this.getEditionPattern(), null, "editionPattern", null, 0, 1, AddEMFObjectIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddEMFObjectIndividual_ModelSlot(), this.getModelSlot(), null, "modelSlot", null, 0, 1, AddEMFObjectIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(editionSchemeTypeEEnum, EditionSchemeType.class, "EditionSchemeType");
    addEEnumLiteral(editionSchemeTypeEEnum, EditionSchemeType.CREATION_SCHEME);
    addEEnumLiteral(editionSchemeTypeEEnum, EditionSchemeType.DELETION_SCHEME);
    addEEnumLiteral(editionSchemeTypeEEnum, EditionSchemeType.ACTION_SCHEME);
    addEEnumLiteral(editionSchemeTypeEEnum, EditionSchemeType.CLONING_SCHEME);

    initEEnum(mstypeEEnum, org.xtext.example.mydsl.fML.MSTYPE.class, "MSTYPE");
    addEEnumLiteral(mstypeEEnum, org.xtext.example.mydsl.fML.MSTYPE.OWL);
    addEEnumLiteral(mstypeEEnum, org.xtext.example.mydsl.fML.MSTYPE.DIAG);
    addEEnumLiteral(mstypeEEnum, org.xtext.example.mydsl.fML.MSTYPE.EMF);
    addEEnumLiteral(mstypeEEnum, org.xtext.example.mydsl.fML.MSTYPE.VIRTUAL);
    addEEnumLiteral(mstypeEEnum, org.xtext.example.mydsl.fML.MSTYPE.XSD);

    initEEnum(vmtypeEEnum, org.xtext.example.mydsl.fML.VMTYPE.class, "VMTYPE");
    addEEnumLiteral(vmtypeEEnum, org.xtext.example.mydsl.fML.VMTYPE.DIAG_SPEC);
    addEEnumLiteral(vmtypeEEnum, org.xtext.example.mydsl.fML.VMTYPE.VM);

    initEEnum(prtypeEEnum, org.xtext.example.mydsl.fML.PRTYPE.class, "PRTYPE");
    addEEnumLiteral(prtypeEEnum, org.xtext.example.mydsl.fML.PRTYPE.INDIVIDUAL);

    // Create resource
    createResource(eNS_URI);
  }

} //FMLPackageImpl
