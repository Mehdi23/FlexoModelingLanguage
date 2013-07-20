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

import org.xtext.example.mydsl.fML.EditionAction;
import org.xtext.example.mydsl.fML.EditionScheme;
import org.xtext.example.mydsl.fML.EditionSchemeType;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edition Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.EditionSchemeImpl#getEditionSchemeType <em>Edition Scheme Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.EditionSchemeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.EditionSchemeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.EditionSchemeImpl#getEditionAction <em>Edition Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditionSchemeImpl extends MinimalEObjectImpl.Container implements EditionScheme
{
  /**
   * The default value of the '{@link #getEditionSchemeType() <em>Edition Scheme Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditionSchemeType()
   * @generated
   * @ordered
   */
  protected static final EditionSchemeType EDITION_SCHEME_TYPE_EDEFAULT = EditionSchemeType.CREATION_SCHEME;

  /**
   * The cached value of the '{@link #getEditionSchemeType() <em>Edition Scheme Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditionSchemeType()
   * @generated
   * @ordered
   */
  protected EditionSchemeType editionSchemeType = EDITION_SCHEME_TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameter;

  /**
   * The cached value of the '{@link #getEditionAction() <em>Edition Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditionAction()
   * @generated
   * @ordered
   */
  protected EList<EditionAction> editionAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditionSchemeImpl()
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
    return FMLPackage.Literals.EDITION_SCHEME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionSchemeType getEditionSchemeType()
  {
    return editionSchemeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditionSchemeType(EditionSchemeType newEditionSchemeType)
  {
    EditionSchemeType oldEditionSchemeType = editionSchemeType;
    editionSchemeType = newEditionSchemeType == null ? EDITION_SCHEME_TYPE_EDEFAULT : newEditionSchemeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.EDITION_SCHEME__EDITION_SCHEME_TYPE, oldEditionSchemeType, editionSchemeType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.EDITION_SCHEME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, FMLPackage.EDITION_SCHEME__PARAMETER);
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EditionAction> getEditionAction()
  {
    if (editionAction == null)
    {
      editionAction = new EObjectContainmentEList<EditionAction>(EditionAction.class, this, FMLPackage.EDITION_SCHEME__EDITION_ACTION);
    }
    return editionAction;
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
      case FMLPackage.EDITION_SCHEME__PARAMETER:
        return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
      case FMLPackage.EDITION_SCHEME__EDITION_ACTION:
        return ((InternalEList<?>)getEditionAction()).basicRemove(otherEnd, msgs);
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
      case FMLPackage.EDITION_SCHEME__EDITION_SCHEME_TYPE:
        return getEditionSchemeType();
      case FMLPackage.EDITION_SCHEME__NAME:
        return getName();
      case FMLPackage.EDITION_SCHEME__PARAMETER:
        return getParameter();
      case FMLPackage.EDITION_SCHEME__EDITION_ACTION:
        return getEditionAction();
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
      case FMLPackage.EDITION_SCHEME__EDITION_SCHEME_TYPE:
        setEditionSchemeType((EditionSchemeType)newValue);
        return;
      case FMLPackage.EDITION_SCHEME__NAME:
        setName((String)newValue);
        return;
      case FMLPackage.EDITION_SCHEME__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends Parameter>)newValue);
        return;
      case FMLPackage.EDITION_SCHEME__EDITION_ACTION:
        getEditionAction().clear();
        getEditionAction().addAll((Collection<? extends EditionAction>)newValue);
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
      case FMLPackage.EDITION_SCHEME__EDITION_SCHEME_TYPE:
        setEditionSchemeType(EDITION_SCHEME_TYPE_EDEFAULT);
        return;
      case FMLPackage.EDITION_SCHEME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FMLPackage.EDITION_SCHEME__PARAMETER:
        getParameter().clear();
        return;
      case FMLPackage.EDITION_SCHEME__EDITION_ACTION:
        getEditionAction().clear();
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
      case FMLPackage.EDITION_SCHEME__EDITION_SCHEME_TYPE:
        return editionSchemeType != EDITION_SCHEME_TYPE_EDEFAULT;
      case FMLPackage.EDITION_SCHEME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FMLPackage.EDITION_SCHEME__PARAMETER:
        return parameter != null && !parameter.isEmpty();
      case FMLPackage.EDITION_SCHEME__EDITION_ACTION:
        return editionAction != null && !editionAction.isEmpty();
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
    result.append(" (editionSchemeType: ");
    result.append(editionSchemeType);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EditionSchemeImpl
