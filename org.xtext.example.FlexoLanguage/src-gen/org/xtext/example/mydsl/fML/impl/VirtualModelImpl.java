/**
 */
package org.xtext.example.mydsl.fML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.fML.EditionPattern;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.ModelSlot;
import org.xtext.example.mydsl.fML.VMTYPE;
import org.xtext.example.mydsl.fML.VirtualModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.VirtualModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.VirtualModelImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.VirtualModelImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.VirtualModelImpl#getModelSlots <em>Model Slots</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.VirtualModelImpl#getEditionPatterns <em>Edition Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualModelImpl extends MinimalEObjectImpl.Container implements VirtualModel
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
  protected static final VMTYPE TYPE_EDEFAULT = VMTYPE.DIAG_SPEC;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected VMTYPE type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getModelSlots() <em>Model Slots</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelSlots()
   * @generated
   * @ordered
   */
  protected EList<ModelSlot> modelSlots;

  /**
   * The cached value of the '{@link #getEditionPatterns() <em>Edition Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditionPatterns()
   * @generated
   * @ordered
   */
  protected EList<EditionPattern> editionPatterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VirtualModelImpl()
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
    return FMLPackage.Literals.VIRTUAL_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.VIRTUAL_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMTYPE getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(VMTYPE newType)
  {
    VMTYPE oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.VIRTUAL_MODEL__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.VIRTUAL_MODEL__URI, oldUri, uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelSlot> getModelSlots()
  {
    if (modelSlots == null)
    {
      modelSlots = new EObjectContainmentEList<ModelSlot>(ModelSlot.class, this, FMLPackage.VIRTUAL_MODEL__MODEL_SLOTS);
    }
    return modelSlots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EditionPattern> getEditionPatterns()
  {
    if (editionPatterns == null)
    {
      editionPatterns = new EObjectContainmentEList<EditionPattern>(EditionPattern.class, this, FMLPackage.VIRTUAL_MODEL__EDITION_PATTERNS);
    }
    return editionPatterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FMLPackage.VIRTUAL_MODEL__MODEL_SLOTS:
        return ((InternalEList<?>)getModelSlots()).basicRemove(otherEnd, msgs);
      case FMLPackage.VIRTUAL_MODEL__EDITION_PATTERNS:
        return ((InternalEList<?>)getEditionPatterns()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FMLPackage.VIRTUAL_MODEL__NAME:
        return getName();
      case FMLPackage.VIRTUAL_MODEL__TYPE:
        return getType();
      case FMLPackage.VIRTUAL_MODEL__URI:
        return getUri();
      case FMLPackage.VIRTUAL_MODEL__MODEL_SLOTS:
        return getModelSlots();
      case FMLPackage.VIRTUAL_MODEL__EDITION_PATTERNS:
        return getEditionPatterns();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FMLPackage.VIRTUAL_MODEL__NAME:
        setName((String)newValue);
        return;
      case FMLPackage.VIRTUAL_MODEL__TYPE:
        setType((VMTYPE)newValue);
        return;
      case FMLPackage.VIRTUAL_MODEL__URI:
        setUri((String)newValue);
        return;
      case FMLPackage.VIRTUAL_MODEL__MODEL_SLOTS:
        getModelSlots().clear();
        getModelSlots().addAll((Collection<? extends ModelSlot>)newValue);
        return;
      case FMLPackage.VIRTUAL_MODEL__EDITION_PATTERNS:
        getEditionPatterns().clear();
        getEditionPatterns().addAll((Collection<? extends EditionPattern>)newValue);
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
      case FMLPackage.VIRTUAL_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FMLPackage.VIRTUAL_MODEL__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case FMLPackage.VIRTUAL_MODEL__URI:
        setUri(URI_EDEFAULT);
        return;
      case FMLPackage.VIRTUAL_MODEL__MODEL_SLOTS:
        getModelSlots().clear();
        return;
      case FMLPackage.VIRTUAL_MODEL__EDITION_PATTERNS:
        getEditionPatterns().clear();
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
      case FMLPackage.VIRTUAL_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FMLPackage.VIRTUAL_MODEL__TYPE:
        return type != TYPE_EDEFAULT;
      case FMLPackage.VIRTUAL_MODEL__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
      case FMLPackage.VIRTUAL_MODEL__MODEL_SLOTS:
        return modelSlots != null && !modelSlots.isEmpty();
      case FMLPackage.VIRTUAL_MODEL__EDITION_PATTERNS:
        return editionPatterns != null && !editionPatterns.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //VirtualModelImpl
