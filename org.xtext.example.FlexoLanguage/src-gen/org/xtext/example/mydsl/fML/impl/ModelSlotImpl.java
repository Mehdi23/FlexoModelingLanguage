/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.MSTYPE;
import org.xtext.example.mydsl.fML.ModelSlot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ModelSlotImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ModelSlotImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ModelSlotImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ModelSlotImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ModelSlotImpl#getReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelSlotImpl extends MinimalEObjectImpl.Container implements ModelSlot
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
  protected static final MSTYPE TYPE_EDEFAULT = MSTYPE.OWL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected MSTYPE type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected static final String URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected String uri = URI_EDEFAULT;

  /**
   * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired()
   * @generated
   * @ordered
   */
  protected static final String REQUIRED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired()
   * @generated
   * @ordered
   */
  protected String required = REQUIRED_EDEFAULT;

  /**
   * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadOnly()
   * @generated
   * @ordered
   */
  protected static final String READ_ONLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadOnly()
   * @generated
   * @ordered
   */
  protected String readOnly = READ_ONLY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelSlotImpl()
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
    return FMLPackage.Literals.MODEL_SLOT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.MODEL_SLOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MSTYPE getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(MSTYPE newType)
  {
    MSTYPE oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.MODEL_SLOT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUri(String newUri)
  {
    String oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.MODEL_SLOT__URI, oldUri, uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(String newRequired)
  {
    String oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.MODEL_SLOT__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReadOnly()
  {
    return readOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadOnly(String newReadOnly)
  {
    String oldReadOnly = readOnly;
    readOnly = newReadOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.MODEL_SLOT__READ_ONLY, oldReadOnly, readOnly));
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
      case FMLPackage.MODEL_SLOT__NAME:
        return getName();
      case FMLPackage.MODEL_SLOT__TYPE:
        return getType();
      case FMLPackage.MODEL_SLOT__URI:
        return getUri();
      case FMLPackage.MODEL_SLOT__REQUIRED:
        return getRequired();
      case FMLPackage.MODEL_SLOT__READ_ONLY:
        return getReadOnly();
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
      case FMLPackage.MODEL_SLOT__NAME:
        setName((String)newValue);
        return;
      case FMLPackage.MODEL_SLOT__TYPE:
        setType((MSTYPE)newValue);
        return;
      case FMLPackage.MODEL_SLOT__URI:
        setUri((String)newValue);
        return;
      case FMLPackage.MODEL_SLOT__REQUIRED:
        setRequired((String)newValue);
        return;
      case FMLPackage.MODEL_SLOT__READ_ONLY:
        setReadOnly((String)newValue);
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
      case FMLPackage.MODEL_SLOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FMLPackage.MODEL_SLOT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case FMLPackage.MODEL_SLOT__URI:
        setUri(URI_EDEFAULT);
        return;
      case FMLPackage.MODEL_SLOT__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case FMLPackage.MODEL_SLOT__READ_ONLY:
        setReadOnly(READ_ONLY_EDEFAULT);
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
      case FMLPackage.MODEL_SLOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FMLPackage.MODEL_SLOT__TYPE:
        return type != TYPE_EDEFAULT;
      case FMLPackage.MODEL_SLOT__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
      case FMLPackage.MODEL_SLOT__REQUIRED:
        return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
      case FMLPackage.MODEL_SLOT__READ_ONLY:
        return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
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
    result.append(", uri: ");
    result.append(uri);
    result.append(", required: ");
    result.append(required);
    result.append(", readOnly: ");
    result.append(readOnly);
    result.append(')');
    return result.toString();
  }

} //ModelSlotImpl
