/**
 * generated by Xtext 2.14.0
 */
package ale.xtext.ale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.AleRoot#getName <em>Name</em>}</li>
 *   <li>{@link ale.xtext.ale.AleRoot#getJavaImports <em>Java Imports</em>}</li>
 *   <li>{@link ale.xtext.ale.AleRoot#getEcoreImport <em>Ecore Import</em>}</li>
 *   <li>{@link ale.xtext.ale.AleRoot#getAleImports <em>Ale Imports</em>}</li>
 *   <li>{@link ale.xtext.ale.AleRoot#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getAleRoot()
 * @model
 * @generated
 */
public interface AleRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ale.xtext.ale.AlePackage#getAleRoot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ale.xtext.ale.AleRoot#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Java Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Imports</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Imports</em>' containment reference.
   * @see #setJavaImports(XImportSection)
   * @see ale.xtext.ale.AlePackage#getAleRoot_JavaImports()
   * @model containment="true"
   * @generated
   */
  XImportSection getJavaImports();

  /**
   * Sets the value of the '{@link ale.xtext.ale.AleRoot#getJavaImports <em>Java Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Imports</em>' containment reference.
   * @see #getJavaImports()
   * @generated
   */
  void setJavaImports(XImportSection value);

  /**
   * Returns the value of the '<em><b>Ecore Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecore Import</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecore Import</em>' containment reference.
   * @see #setEcoreImport(EcoreImport)
   * @see ale.xtext.ale.AlePackage#getAleRoot_EcoreImport()
   * @model containment="true"
   * @generated
   */
  EcoreImport getEcoreImport();

  /**
   * Sets the value of the '{@link ale.xtext.ale.AleRoot#getEcoreImport <em>Ecore Import</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ecore Import</em>' containment reference.
   * @see #getEcoreImport()
   * @generated
   */
  void setEcoreImport(EcoreImport value);

  /**
   * Returns the value of the '<em><b>Ale Imports</b></em>' containment reference list.
   * The list contents are of type {@link ale.xtext.ale.AleImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ale Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ale Imports</em>' containment reference list.
   * @see ale.xtext.ale.AlePackage#getAleRoot_AleImports()
   * @model containment="true"
   * @generated
   */
  EList<AleImport> getAleImports();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link ale.xtext.ale.AleClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see ale.xtext.ale.AlePackage#getAleRoot_Classes()
   * @model containment="true"
   * @generated
   */
  EList<AleClass> getClasses();

} // AleRoot