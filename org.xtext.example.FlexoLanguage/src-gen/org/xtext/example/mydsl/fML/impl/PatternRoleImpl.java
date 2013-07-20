/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.ModelSlot;
import org.xtext.example.mydsl.fML.PRTYPE;
import org.xtext.example.mydsl.fML.PatternRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.PatternRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.PatternRoleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.PatternRoleImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.PatternRoleImpl#getModelSlot <em>Model Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternRoleImpl extends MinimalEObjectImpl.Container implements PatternRole
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final PRTYPE TYPE_EDEFAULT = PRTYPE.INDIVIDUAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected PRTYPE type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getModelElement() <em>Model Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelElement()
   * @generated
   * @ordered
   */
  protected static final String MODEL_ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelElement()
   * @generated
   * @ordered
   */
  protected String modelElement = MODEL_ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getModelSlot() <em>Model Slot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelSlot()
   * @generated
   * @ordered
   */
  protected ModelSlot modelSlot;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternRoleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FMLPackage.Literals.PATTERN_ROLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PATTERN_ROLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PRTYPE getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(PRTYPE newType)
  {
    PRTYPE oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PATTERN_ROLE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelElement()
  {
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelElement(String newModelElement)
  {
    String oldModelElement = modelElement;
    modelElement = newModelElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PATTERN_ROLE__MODEL_ELEMENT, oldModelElement, modelElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelSlot getModelSlot()
  {
    if (modelSlot != null && modelSlot.eIsProxy())
    {
      InternalEObject oldModelSlot = (InternalEObject)modelSlot;
      modelSlot = (ModelSlot)eResolveProxy(oldModelSlot);
      if (modelSlot != oldModelSlot)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMLPackage.PATTERN_ROLE__MODEL_SLOT, oldModelSlot, modelSlot));
      }
    }
    return modelSlot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelSlot basicGetModelSlot()
  {
    return modelSlot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelSlot(ModelSlot newModelSlot)
  {
    ModelSlot oldModelSlot = modelSlot;
    modelSlot = newModelSlot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PATTERN_ROLE__MODEL_SLOT, oldModelSlot, modelSlot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FMLPackage.PATTERN_ROLE__NAME:
        return getName();
      case FMLPackage.PATTERN_ROLE__TYPE:
        return getType();
      case FMLPackage.PATTERN_ROLE__MODEL_ELEMENT:
        return getModelElement();
      case FMLPackage.PATTERN_ROLE__MODEL_SLOT:
        if (resolve) return getModelSlot();
        return basicGetModelSlot();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FMLPackage.PATTERN_ROLE__NAME:
        setName((String)newValue);
        return;
      case FMLPackage.PATTERN_ROLE__TYPE:
        setType((PRTYPE)newValue);
        return;
      case FMLPackage.PATTERN_ROLE__MODEL_ELEMENT:
        setModelElement((String)newValue);
        return;
      case FMLPackage.PATTERN_ROLE__MODEL_SLOT:
        setModelSlot((ModelSlot)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FMLPackage.PATTERN_ROLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FMLPackage.PATTERN_ROLE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case FMLPackage.PATTERN_ROLE__MODEL_ELEMENT:
        setModelElement(MODEL_ELEMENT_EDEFAULT);
        return;
      case FMLPackage.PATTERN_ROLE__MODEL_SLOT:
        setModelSlot((ModelSlot)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FMLPackage.PATTERN_ROLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FMLPackage.PATTERN_ROLE__TYPE:
        return type != TYPE_EDEFAULT;
      case FMLPackage.PATTERN_ROLE__MODEL_ELEMENT:
        return MODEL_ELEMENT_EDEFAULT == null ? modelElement != null : !MODEL_ELEMENT_EDEFAULT.equals(modelElement);
      case FMLPackage.PATTERN_ROLE__MODEL_SLOT:
        return modelSlot != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", modelElement: ");
    result.append(modelElement);
    result.append(')');
    return result.toString();
  }

} //PatternRoleImpl
