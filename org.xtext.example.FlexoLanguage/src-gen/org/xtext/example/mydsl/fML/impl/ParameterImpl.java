/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.fML.EditionPattern;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.PRTYPE;
import org.xtext.example.mydsl.fML.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ParameterImpl#getWidget <em>Widget</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ParameterImpl#getEditionPattern <em>Edition Pattern</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ParameterImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
{
  /**
   * The default value of the '{@link #getWidget() <em>Widget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidget()
   * @generated
   * @ordered
   */
  protected static final PRTYPE WIDGET_EDEFAULT = PRTYPE.INDIVIDUAL;

  /**
   * The cached value of the '{@link #getWidget() <em>Widget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidget()
   * @generated
   * @ordered
   */
  protected PRTYPE widget = WIDGET_EDEFAULT;

  /**
   * The cached value of the '{@link #getEditionPattern() <em>Edition Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditionPattern()
   * @generated
   * @ordered
   */
  protected EditionPattern editionPattern;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return FMLPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PRTYPE getWidget()
  {
    return widget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidget(PRTYPE newWidget)
  {
    PRTYPE oldWidget = widget;
    widget = newWidget == null ? WIDGET_EDEFAULT : newWidget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PARAMETER__WIDGET, oldWidget, widget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionPattern getEditionPattern()
  {
    if (editionPattern != null && editionPattern.eIsProxy())
    {
      InternalEObject oldEditionPattern = (InternalEObject)editionPattern;
      editionPattern = (EditionPattern)eResolveProxy(oldEditionPattern);
      if (editionPattern != oldEditionPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMLPackage.PARAMETER__EDITION_PATTERN, oldEditionPattern, editionPattern));
      }
    }
    return editionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionPattern basicGetEditionPattern()
  {
    return editionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditionPattern(EditionPattern newEditionPattern)
  {
    EditionPattern oldEditionPattern = editionPattern;
    editionPattern = newEditionPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PARAMETER__EDITION_PATTERN, oldEditionPattern, editionPattern));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PARAMETER__NAME, oldName, name));
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
      case FMLPackage.PARAMETER__WIDGET:
        return getWidget();
      case FMLPackage.PARAMETER__EDITION_PATTERN:
        if (resolve) return getEditionPattern();
        return basicGetEditionPattern();
      case FMLPackage.PARAMETER__NAME:
        return getName();
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
      case FMLPackage.PARAMETER__WIDGET:
        setWidget((PRTYPE)newValue);
        return;
      case FMLPackage.PARAMETER__EDITION_PATTERN:
        setEditionPattern((EditionPattern)newValue);
        return;
      case FMLPackage.PARAMETER__NAME:
        setName((String)newValue);
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
      case FMLPackage.PARAMETER__WIDGET:
        setWidget(WIDGET_EDEFAULT);
        return;
      case FMLPackage.PARAMETER__EDITION_PATTERN:
        setEditionPattern((EditionPattern)null);
        return;
      case FMLPackage.PARAMETER__NAME:
        setName(NAME_EDEFAULT);
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
      case FMLPackage.PARAMETER__WIDGET:
        return widget != WIDGET_EDEFAULT;
      case FMLPackage.PARAMETER__EDITION_PATTERN:
        return editionPattern != null;
      case FMLPackage.PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (widget: ");
    result.append(widget);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
