/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Block#getLabel <em>Label</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Block#getDescription <em>Description</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Block#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Block#isIsDraft <em>Is Draft</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Block#getBlockresources <em>Blockresources</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Block#getSubblocks <em>Subblocks</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlock_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Block#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlock_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Block#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlock_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Block#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Is Draft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Draft</em>' attribute.
	 * @see #setIsDraft(boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlock_IsDraft()
	 * @model
	 * @generated
	 */
	boolean isIsDraft();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Block#isIsDraft <em>Is Draft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Draft</em>' attribute.
	 * @see #isIsDraft()
	 * @generated
	 */
	void setIsDraft(boolean value);

	/**
	 * Returns the value of the '<em><b>Blockresources</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockresources</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlock_Blockresources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceResources> getBlockresources();

	/**
	 * Returns the value of the '<em><b>Subblocks</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subblocks</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBlock_Subblocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getSubblocks();

} // Block
