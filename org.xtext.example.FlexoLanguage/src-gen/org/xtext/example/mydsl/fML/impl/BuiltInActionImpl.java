/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.fML.BuiltInAction;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.PatternRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.BuiltInActionImpl#getPatternRole <em>Pattern Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltInActionImpl extends EditionActionImpl implements BuiltInAction
{
  /**
   * The cached value of the '{@link #getPatternRole() <em>Pattern Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternRole()
   * @generated
   * @ordered
   */
  protected PatternRole patternRole;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltInActionImpl()
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
    return FMLPackage.Literals.BUILT_IN_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternRole getPatternRole()
  {
    if (patternRole != null && patternRole.eIsProxy())
    {
      InternalEObject oldPatternRole = (InternalEObject)patternRole;
      patternRole = (PatternRole)eResolveProxy(oldPatternRole);
      if (patternRole != oldPatternRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMLPackage.BUILT_IN_ACTION__PATTERN_ROLE, oldPatternRole, patternRole));
      }
    }
    return patternRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternRole basicGetPatternRole()
  {
    return patternRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatternRole(PatternRole newPatternRole)
  {
    PatternRole oldPatternRole = patternRole;
    patternRole = newPatternRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.BUILT_IN_ACTION__PATTERN_ROLE, oldPatternRole, patternRole));
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
      case FMLPackage.BUILT_IN_ACTION__PATTERN_ROLE:
        if (resolve) return getPatternRole();
        return basicGetPatternRole();
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
      case FMLPackage.BUILT_IN_ACTION__PATTERN_ROLE:
        setPatternRole((PatternRole)newValue);
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
      case FMLPackage.BUILT_IN_ACTION__PATTERN_ROLE:
        setPatternRole((PatternRole)null);
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
      case FMLPackage.BUILT_IN_ACTION__PATTERN_ROLE:
        return patternRole != null;
    }
    return super.eIsSet(featureID);
  }

} //BuiltInActionImpl
