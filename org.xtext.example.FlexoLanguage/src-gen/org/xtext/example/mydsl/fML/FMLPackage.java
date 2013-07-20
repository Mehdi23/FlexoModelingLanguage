/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.fML.FMLFactory
 * @model kind="package"
 * @generated
 */
public interface FMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/FML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FMLPackage eINSTANCE = org.xtext.example.mydsl.fML.impl.FMLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.ViewDefImpl <em>View Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.ViewDefImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getViewDef()
   * @generated
   */
  int VIEW_DEF = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DEF__URI = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DEF__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>View Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.VirtualModelImpl <em>Virtual Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.VirtualModelImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getVirtualModel()
   * @generated
   */
  int VIRTUAL_MODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MODEL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MODEL__URI = 2;

  /**
   * The feature id for the '<em><b>Model Slots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MODEL__MODEL_SLOTS = 3;

  /**
   * The feature id for the '<em><b>Edition Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MODEL__EDITION_PATTERNS = 4;

  /**
   * The number of structural features of the '<em>Virtual Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.ModelSlotImpl <em>Model Slot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.ModelSlotImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getModelSlot()
   * @generated
   */
  int MODEL_SLOT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SLOT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SLOT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SLOT__URI = 2;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SLOT__REQUIRED = 3;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SLOT__READ_ONLY = 4;

  /**
   * The number of structural features of the '<em>Model Slot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SLOT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.EditionPatternImpl <em>Edition Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.EditionPatternImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getEditionPattern()
   * @generated
   */
  int EDITION_PATTERN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_PATTERN__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Edition Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_PATTERN__SUPER_EDITION_PATTERN = 1;

  /**
   * The feature id for the '<em><b>Pattern Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_PATTERN__PATTERN_ROLES = 2;

  /**
   * The feature id for the '<em><b>Edition Schemes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_PATTERN__EDITION_SCHEMES = 3;

  /**
   * The number of structural features of the '<em>Edition Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_PATTERN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.PatternRoleImpl <em>Pattern Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.PatternRoleImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getPatternRole()
   * @generated
   */
  int PATTERN_ROLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_ROLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_ROLE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Model Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_ROLE__MODEL_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Model Slot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_ROLE__MODEL_SLOT = 3;

  /**
   * The number of structural features of the '<em>Pattern Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_ROLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.EditionSchemeImpl <em>Edition Scheme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.EditionSchemeImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getEditionScheme()
   * @generated
   */
  int EDITION_SCHEME = 5;

  /**
   * The feature id for the '<em><b>Edition Scheme Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_SCHEME__EDITION_SCHEME_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_SCHEME__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_SCHEME__PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Edition Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_SCHEME__EDITION_ACTION = 3;

  /**
   * The number of structural features of the '<em>Edition Scheme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_SCHEME_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.ParameterImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Widget</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__WIDGET = 0;

  /**
   * The feature id for the '<em><b>Edition Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__EDITION_PATTERN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.EditionActionImpl <em>Edition Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.EditionActionImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getEditionAction()
   * @generated
   */
  int EDITION_ACTION = 7;

  /**
   * The number of structural features of the '<em>Edition Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITION_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.BuiltInActionImpl <em>Built In Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.BuiltInActionImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getBuiltInAction()
   * @generated
   */
  int BUILT_IN_ACTION = 8;

  /**
   * The feature id for the '<em><b>Pattern Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ACTION__PATTERN_ROLE = EDITION_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Built In Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ACTION_FEATURE_COUNT = EDITION_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.DeclarePatternRoleImpl <em>Declare Pattern Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.DeclarePatternRoleImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getDeclarePatternRole()
   * @generated
   */
  int DECLARE_PATTERN_ROLE = 9;

  /**
   * The feature id for the '<em><b>Pattern Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARE_PATTERN_ROLE__PATTERN_ROLE = BUILT_IN_ACTION__PATTERN_ROLE;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARE_PATTERN_ROLE__PARAMETER = BUILT_IN_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Declare Pattern Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARE_PATTERN_ROLE_FEATURE_COUNT = BUILT_IN_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.impl.DeleteActionImpl <em>Delete Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.impl.DeleteActionImpl
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getDeleteAction()
   * @generated
   */
  int DELETE_ACTION = 10;

  /**
   * The feature id for the '<em><b>Pattern Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_ACTION__PATTERN_ROLE = BUILT_IN_ACTION__PATTERN_ROLE;

  /**
   * The number of structural features of the '<em>Delete Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_ACTION_FEATURE_COUNT = BUILT_IN_ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.EditionSchemeType <em>Edition Scheme Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.EditionSchemeType
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getEditionSchemeType()
   * @generated
   */
  int EDITION_SCHEME_TYPE = 11;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.MSTYPE <em>MSTYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.MSTYPE
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getMSTYPE()
   * @generated
   */
  int MSTYPE = 12;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.VMTYPE <em>VMTYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.VMTYPE
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getVMTYPE()
   * @generated
   */
  int VMTYPE = 13;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.fML.PRTYPE <em>PRTYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.fML.PRTYPE
   * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getPRTYPE()
   * @generated
   */
  int PRTYPE = 14;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.ViewDef <em>View Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Def</em>'.
   * @see org.xtext.example.mydsl.fML.ViewDef
   * @generated
   */
  EClass getViewDef();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.ViewDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.fML.ViewDef#getName()
   * @see #getViewDef()
   * @generated
   */
  EAttribute getViewDef_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.ViewDef#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.xtext.example.mydsl.fML.ViewDef#getUri()
   * @see #getViewDef()
   * @generated
   */
  EAttribute getViewDef_Uri();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.fML.ViewDef#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.fML.ViewDef#getElements()
   * @see #getViewDef()
   * @generated
   */
  EReference getViewDef_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.VirtualModel <em>Virtual Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Model</em>'.
   * @see org.xtext.example.mydsl.fML.VirtualModel
   * @generated
   */
  EClass getVirtualModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.VirtualModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.fML.VirtualModel#getName()
   * @see #getVirtualModel()
   * @generated
   */
  EAttribute getVirtualModel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.VirtualModel#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.fML.VirtualModel#getType()
   * @see #getVirtualModel()
   * @generated
   */
  EAttribute getVirtualModel_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.VirtualModel#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.xtext.example.mydsl.fML.VirtualModel#getUri()
   * @see #getVirtualModel()
   * @generated
   */
  EAttribute getVirtualModel_Uri();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.fML.VirtualModel#getModelSlots <em>Model Slots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model Slots</em>'.
   * @see org.xtext.example.mydsl.fML.VirtualModel#getModelSlots()
   * @see #getVirtualModel()
   * @generated
   */
  EReference getVirtualModel_ModelSlots();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.fML.VirtualModel#getEditionPatterns <em>Edition Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edition Patterns</em>'.
   * @see org.xtext.example.mydsl.fML.VirtualModel#getEditionPatterns()
   * @see #getVirtualModel()
   * @generated
   */
  EReference getVirtualModel_EditionPatterns();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.ModelSlot <em>Model Slot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Slot</em>'.
   * @see org.xtext.example.mydsl.fML.ModelSlot
   * @generated
   */
  EClass getModelSlot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.ModelSlot#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.fML.ModelSlot#getName()
   * @see #getModelSlot()
   * @generated
   */
  EAttribute getModelSlot_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.ModelSlot#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.fML.ModelSlot#getType()
   * @see #getModelSlot()
   * @generated
   */
  EAttribute getModelSlot_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.ModelSlot#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.xtext.example.mydsl.fML.ModelSlot#getUri()
   * @see #getModelSlot()
   * @generated
   */
  EAttribute getModelSlot_Uri();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.ModelSlot#getRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see org.xtext.example.mydsl.fML.ModelSlot#getRequired()
   * @see #getModelSlot()
   * @generated
   */
  EAttribute getModelSlot_Required();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.ModelSlot#getReadOnly <em>Read Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Read Only</em>'.
   * @see org.xtext.example.mydsl.fML.ModelSlot#getReadOnly()
   * @see #getModelSlot()
   * @generated
   */
  EAttribute getModelSlot_ReadOnly();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.EditionPattern <em>Edition Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edition Pattern</em>'.
   * @see org.xtext.example.mydsl.fML.EditionPattern
   * @generated
   */
  EClass getEditionPattern();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.EditionPattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.fML.EditionPattern#getName()
   * @see #getEditionPattern()
   * @generated
   */
  EAttribute getEditionPattern_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.fML.EditionPattern#getSuperEditionPattern <em>Super Edition Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Edition Pattern</em>'.
   * @see org.xtext.example.mydsl.fML.EditionPattern#getSuperEditionPattern()
   * @see #getEditionPattern()
   * @generated
   */
  EReference getEditionPattern_SuperEditionPattern();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.fML.EditionPattern#getPatternRoles <em>Pattern Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pattern Roles</em>'.
   * @see org.xtext.example.mydsl.fML.EditionPattern#getPatternRoles()
   * @see #getEditionPattern()
   * @generated
   */
  EReference getEditionPattern_PatternRoles();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.fML.EditionPattern#getEditionSchemes <em>Edition Schemes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edition Schemes</em>'.
   * @see org.xtext.example.mydsl.fML.EditionPattern#getEditionSchemes()
   * @see #getEditionPattern()
   * @generated
   */
  EReference getEditionPattern_EditionSchemes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.PatternRole <em>Pattern Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern Role</em>'.
   * @see org.xtext.example.mydsl.fML.PatternRole
   * @generated
   */
  EClass getPatternRole();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.PatternRole#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.fML.PatternRole#getName()
   * @see #getPatternRole()
   * @generated
   */
  EAttribute getPatternRole_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.PatternRole#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.fML.PatternRole#getType()
   * @see #getPatternRole()
   * @generated
   */
  EAttribute getPatternRole_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.PatternRole#getModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Element</em>'.
   * @see org.xtext.example.mydsl.fML.PatternRole#getModelElement()
   * @see #getPatternRole()
   * @generated
   */
  EAttribute getPatternRole_ModelElement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.fML.PatternRole#getModelSlot <em>Model Slot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Slot</em>'.
   * @see org.xtext.example.mydsl.fML.PatternRole#getModelSlot()
   * @see #getPatternRole()
   * @generated
   */
  EReference getPatternRole_ModelSlot();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.EditionScheme <em>Edition Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edition Scheme</em>'.
   * @see org.xtext.example.mydsl.fML.EditionScheme
   * @generated
   */
  EClass getEditionScheme();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.EditionScheme#getEditionSchemeType <em>Edition Scheme Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Edition Scheme Type</em>'.
   * @see org.xtext.example.mydsl.fML.EditionScheme#getEditionSchemeType()
   * @see #getEditionScheme()
   * @generated
   */
  EAttribute getEditionScheme_EditionSchemeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.EditionScheme#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.fML.EditionScheme#getName()
   * @see #getEditionScheme()
   * @generated
   */
  EAttribute getEditionScheme_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.fML.EditionScheme#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.fML.EditionScheme#getParameter()
   * @see #getEditionScheme()
   * @generated
   */
  EReference getEditionScheme_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.fML.EditionScheme#getEditionAction <em>Edition Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edition Action</em>'.
   * @see org.xtext.example.mydsl.fML.EditionScheme#getEditionAction()
   * @see #getEditionScheme()
   * @generated
   */
  EReference getEditionScheme_EditionAction();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.fML.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.Parameter#getWidget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Widget</em>'.
   * @see org.xtext.example.mydsl.fML.Parameter#getWidget()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Widget();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.fML.Parameter#getEditionPattern <em>Edition Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Edition Pattern</em>'.
   * @see org.xtext.example.mydsl.fML.Parameter#getEditionPattern()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_EditionPattern();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.fML.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.fML.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.EditionAction <em>Edition Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edition Action</em>'.
   * @see org.xtext.example.mydsl.fML.EditionAction
   * @generated
   */
  EClass getEditionAction();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.BuiltInAction <em>Built In Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Action</em>'.
   * @see org.xtext.example.mydsl.fML.BuiltInAction
   * @generated
   */
  EClass getBuiltInAction();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.fML.BuiltInAction#getPatternRole <em>Pattern Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern Role</em>'.
   * @see org.xtext.example.mydsl.fML.BuiltInAction#getPatternRole()
   * @see #getBuiltInAction()
   * @generated
   */
  EReference getBuiltInAction_PatternRole();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.DeclarePatternRole <em>Declare Pattern Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declare Pattern Role</em>'.
   * @see org.xtext.example.mydsl.fML.DeclarePatternRole
   * @generated
   */
  EClass getDeclarePatternRole();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.fML.DeclarePatternRole#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.fML.DeclarePatternRole#getParameter()
   * @see #getDeclarePatternRole()
   * @generated
   */
  EReference getDeclarePatternRole_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.fML.DeleteAction <em>Delete Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Action</em>'.
   * @see org.xtext.example.mydsl.fML.DeleteAction
   * @generated
   */
  EClass getDeleteAction();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.fML.EditionSchemeType <em>Edition Scheme Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Edition Scheme Type</em>'.
   * @see org.xtext.example.mydsl.fML.EditionSchemeType
   * @generated
   */
  EEnum getEditionSchemeType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.fML.MSTYPE <em>MSTYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>MSTYPE</em>'.
   * @see org.xtext.example.mydsl.fML.MSTYPE
   * @generated
   */
  EEnum getMSTYPE();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.fML.VMTYPE <em>VMTYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>VMTYPE</em>'.
   * @see org.xtext.example.mydsl.fML.VMTYPE
   * @generated
   */
  EEnum getVMTYPE();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.fML.PRTYPE <em>PRTYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>PRTYPE</em>'.
   * @see org.xtext.example.mydsl.fML.PRTYPE
   * @generated
   */
  EEnum getPRTYPE();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FMLFactory getFMLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.ViewDefImpl <em>View Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.ViewDefImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getViewDef()
     * @generated
     */
    EClass VIEW_DEF = eINSTANCE.getViewDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_DEF__NAME = eINSTANCE.getViewDef_Name();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_DEF__URI = eINSTANCE.getViewDef_Uri();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_DEF__ELEMENTS = eINSTANCE.getViewDef_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.VirtualModelImpl <em>Virtual Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.VirtualModelImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getVirtualModel()
     * @generated
     */
    EClass VIRTUAL_MODEL = eINSTANCE.getVirtualModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MODEL__NAME = eINSTANCE.getVirtualModel_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MODEL__TYPE = eINSTANCE.getVirtualModel_Type();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MODEL__URI = eINSTANCE.getVirtualModel_Uri();

    /**
     * The meta object literal for the '<em><b>Model Slots</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIRTUAL_MODEL__MODEL_SLOTS = eINSTANCE.getVirtualModel_ModelSlots();

    /**
     * The meta object literal for the '<em><b>Edition Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIRTUAL_MODEL__EDITION_PATTERNS = eINSTANCE.getVirtualModel_EditionPatterns();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.ModelSlotImpl <em>Model Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.ModelSlotImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getModelSlot()
     * @generated
     */
    EClass MODEL_SLOT = eINSTANCE.getModelSlot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_SLOT__NAME = eINSTANCE.getModelSlot_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_SLOT__TYPE = eINSTANCE.getModelSlot_Type();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_SLOT__URI = eINSTANCE.getModelSlot_Uri();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_SLOT__REQUIRED = eINSTANCE.getModelSlot_Required();

    /**
     * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_SLOT__READ_ONLY = eINSTANCE.getModelSlot_ReadOnly();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.EditionPatternImpl <em>Edition Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.EditionPatternImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getEditionPattern()
     * @generated
     */
    EClass EDITION_PATTERN = eINSTANCE.getEditionPattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDITION_PATTERN__NAME = eINSTANCE.getEditionPattern_Name();

    /**
     * The meta object literal for the '<em><b>Super Edition Pattern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDITION_PATTERN__SUPER_EDITION_PATTERN = eINSTANCE.getEditionPattern_SuperEditionPattern();

    /**
     * The meta object literal for the '<em><b>Pattern Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDITION_PATTERN__PATTERN_ROLES = eINSTANCE.getEditionPattern_PatternRoles();

    /**
     * The meta object literal for the '<em><b>Edition Schemes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDITION_PATTERN__EDITION_SCHEMES = eINSTANCE.getEditionPattern_EditionSchemes();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.PatternRoleImpl <em>Pattern Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.PatternRoleImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getPatternRole()
     * @generated
     */
    EClass PATTERN_ROLE = eINSTANCE.getPatternRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_ROLE__NAME = eINSTANCE.getPatternRole_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_ROLE__TYPE = eINSTANCE.getPatternRole_Type();

    /**
     * The meta object literal for the '<em><b>Model Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_ROLE__MODEL_ELEMENT = eINSTANCE.getPatternRole_ModelElement();

    /**
     * The meta object literal for the '<em><b>Model Slot</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN_ROLE__MODEL_SLOT = eINSTANCE.getPatternRole_ModelSlot();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.EditionSchemeImpl <em>Edition Scheme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.EditionSchemeImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getEditionScheme()
     * @generated
     */
    EClass EDITION_SCHEME = eINSTANCE.getEditionScheme();

    /**
     * The meta object literal for the '<em><b>Edition Scheme Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDITION_SCHEME__EDITION_SCHEME_TYPE = eINSTANCE.getEditionScheme_EditionSchemeType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDITION_SCHEME__NAME = eINSTANCE.getEditionScheme_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDITION_SCHEME__PARAMETER = eINSTANCE.getEditionScheme_Parameter();

    /**
     * The meta object literal for the '<em><b>Edition Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDITION_SCHEME__EDITION_ACTION = eINSTANCE.getEditionScheme_EditionAction();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.ParameterImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Widget</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__WIDGET = eINSTANCE.getParameter_Widget();

    /**
     * The meta object literal for the '<em><b>Edition Pattern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__EDITION_PATTERN = eINSTANCE.getParameter_EditionPattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.EditionActionImpl <em>Edition Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.EditionActionImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getEditionAction()
     * @generated
     */
    EClass EDITION_ACTION = eINSTANCE.getEditionAction();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.BuiltInActionImpl <em>Built In Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.BuiltInActionImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getBuiltInAction()
     * @generated
     */
    EClass BUILT_IN_ACTION = eINSTANCE.getBuiltInAction();

    /**
     * The meta object literal for the '<em><b>Pattern Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_ACTION__PATTERN_ROLE = eINSTANCE.getBuiltInAction_PatternRole();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.DeclarePatternRoleImpl <em>Declare Pattern Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.DeclarePatternRoleImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getDeclarePatternRole()
     * @generated
     */
    EClass DECLARE_PATTERN_ROLE = eINSTANCE.getDeclarePatternRole();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARE_PATTERN_ROLE__PARAMETER = eINSTANCE.getDeclarePatternRole_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.impl.DeleteActionImpl <em>Delete Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.impl.DeleteActionImpl
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getDeleteAction()
     * @generated
     */
    EClass DELETE_ACTION = eINSTANCE.getDeleteAction();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.EditionSchemeType <em>Edition Scheme Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.EditionSchemeType
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getEditionSchemeType()
     * @generated
     */
    EEnum EDITION_SCHEME_TYPE = eINSTANCE.getEditionSchemeType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.MSTYPE <em>MSTYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.MSTYPE
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getMSTYPE()
     * @generated
     */
    EEnum MSTYPE = eINSTANCE.getMSTYPE();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.VMTYPE <em>VMTYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.VMTYPE
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getVMTYPE()
     * @generated
     */
    EEnum VMTYPE = eINSTANCE.getVMTYPE();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.fML.PRTYPE <em>PRTYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.fML.PRTYPE
     * @see org.xtext.example.mydsl.fML.impl.FMLPackageImpl#getPRTYPE()
     * @generated
     */
    EEnum PRTYPE = eINSTANCE.getPRTYPE();

  }

} //FMLPackage
