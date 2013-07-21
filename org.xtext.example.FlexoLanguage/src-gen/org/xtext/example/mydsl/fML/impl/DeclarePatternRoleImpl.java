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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.fML.AddEMFObjectIndividual;
import org.xtext.example.mydsl.fML.DeclarePatternRole;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.Parameter;
import org.xtext.example.mydsl.fML.PatternRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declare Pattern Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.DeclarePatternRoleImpl#getPatternRole <em>Pattern Role</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.DeclarePatternRoleImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.DeclarePatternRoleImpl#getAdd <em>Add</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarePatternRoleImpl extends BuiltInActionImpl implements DeclarePatternRole
{
  /**
   * The cached value of the '{@link #getPatternRole() <em>Pattern Role</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternRole()
   * @generated
   * @ordered
   */
  protected EList<PatternRole> patternRole;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected Parameter parameter;

  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected EList<AddEMFObjectIndividual> add;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarePatternRoleImpl()
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
    return FMLPackage.Literals.DECLARE_PATTERN_ROLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PatternRole> getPatternRole()
  {
    if (patternRole == null)
    {
      patternRole = new EObjectResolvingEList<PatternRole>(PatternRole.class, this, FMLPackage.DECLARE_PATTERN_ROLE__PATTERN_ROLE);
    }
    return patternRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameter()
  {
    if (parameter != null && parameter.eIsProxy())
    {
      InternalEObject oldParameter = (InternalEObject)parameter;
      parameter = (Parameter)eResolveProxy(oldParameter);
      if (parameter != oldParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMLPackage.DECLARE_PATTERN_ROLE__PARAMETER, oldParameter, parameter));
      }
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(Parameter newParameter)
  {
    Parameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.DECLARE_PATTERN_ROLE__PARAMETER, oldParameter, parameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AddEMFObjectIndividual> getAdd()
  {
    if (add == null)
    {
      add = new EObjectContainmentEList<AddEMFObjectIndividual>(AddEMFObjectIndividual.class, this, FMLPackage.DECLARE_PATTERN_ROLE__ADD);
    }
    return add;
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
      case FMLPackage.DECLARE_PATTERN_ROLE__ADD:
        return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
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
      case FMLPackage.DECLARE_PATTERN_ROLE__PATTERN_ROLE:
        return getPatternRole();
      case FMLPackage.DECLARE_PATTERN_ROLE__PARAMETER:
        if (resolve) return getParameter();
        return basicGetParameter();
      case FMLPackage.DECLARE_PATTERN_ROLE__ADD:
        return getAdd();
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
      case FMLPackage.DECLARE_PATTERN_ROLE__PATTERN_ROLE:
        getPatternRole().clear();
        getPatternRole().addAll((Collection<? extends PatternRole>)newValue);
        return;
      case FMLPackage.DECLARE_PATTERN_ROLE__PARAMETER:
        setParameter((Parameter)newValue);
        return;
      case FMLPackage.DECLARE_PATTERN_ROLE__ADD:
        getAdd().clear();
        getAdd().addAll((Collection<? extends AddEMFObjectIndividual>)newValue);
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
      case FMLPackage.DECLARE_PATTERN_ROLE__PATTERN_ROLE:
        getPatternRole().clear();
        return;
      case FMLPackage.DECLARE_PATTERN_ROLE__PARAMETER:
        setParameter((Parameter)null);
        return;
      case FMLPackage.DECLARE_PATTERN_ROLE__ADD:
        getAdd().clear();
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
      case FMLPackage.DECLARE_PATTERN_ROLE__PATTERN_ROLE:
        return patternRole != null && !patternRole.isEmpty();
      case FMLPackage.DECLARE_PATTERN_ROLE__PARAMETER:
        return parameter != null;
      case FMLPackage.DECLARE_PATTERN_ROLE__ADD:
        return add != null && !add.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeclarePatternRoleImpl
