/**
 */
package org.xtext.example.mydsl.fML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MSTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.fML.FMLPackage#getMSTYPE()
 * @model
 * @generated
 */
public enum MSTYPE implements Enumerator
{
  /**
   * The '<em><b>Owl</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OWL_VALUE
   * @generated
   * @ordered
   */
  OWL(0, "owl", "OWLModelSlot"),

  /**
   * The '<em><b>Diag</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIAG_VALUE
   * @generated
   * @ordered
   */
  DIAG(1, "diag", "DiagramModelSlot"),

  /**
   * The '<em><b>Emf</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMF_VALUE
   * @generated
   * @ordered
   */
  EMF(2, "emf", "EMFModelSlot"),

  /**
   * The '<em><b>Virtual</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VIRTUAL_VALUE
   * @generated
   * @ordered
   */
  VIRTUAL(3, "virtual", "VirtualModelModelSlot"),

  /**
   * The '<em><b>Xsd</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XSD_VALUE
   * @generated
   * @ordered
   */
  XSD(4, "xsd", "XSDModelSlot");

  /**
   * The '<em><b>Owl</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Owl</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OWL
   * @model name="owl" literal="OWLModelSlot"
   * @generated
   * @ordered
   */
  public static final int OWL_VALUE = 0;

  /**
   * The '<em><b>Diag</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Diag</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIAG
   * @model name="diag" literal="DiagramModelSlot"
   * @generated
   * @ordered
   */
  public static final int DIAG_VALUE = 1;

  /**
   * The '<em><b>Emf</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Emf</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMF
   * @model name="emf" literal="EMFModelSlot"
   * @generated
   * @ordered
   */
  public static final int EMF_VALUE = 2;

  /**
   * The '<em><b>Virtual</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Virtual</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VIRTUAL
   * @model name="virtual" literal="VirtualModelModelSlot"
   * @generated
   * @ordered
   */
  public static final int VIRTUAL_VALUE = 3;

  /**
   * The '<em><b>Xsd</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Xsd</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XSD
   * @model name="xsd" literal="XSDModelSlot"
   * @generated
   * @ordered
   */
  public static final int XSD_VALUE = 4;

  /**
   * An array of all the '<em><b>MSTYPE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MSTYPE[] VALUES_ARRAY =
    new MSTYPE[]
    {
      OWL,
      DIAG,
      EMF,
      VIRTUAL,
      XSD,
    };

  /**
   * A public read-only list of all the '<em><b>MSTYPE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MSTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>MSTYPE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MSTYPE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MSTYPE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MSTYPE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MSTYPE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MSTYPE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MSTYPE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MSTYPE get(int value)
  {
    switch (value)
    {
      case OWL_VALUE: return OWL;
      case DIAG_VALUE: return DIAG;
      case EMF_VALUE: return EMF;
      case VIRTUAL_VALUE: return VIRTUAL;
      case XSD_VALUE: return XSD;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private MSTYPE(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //MSTYPE
