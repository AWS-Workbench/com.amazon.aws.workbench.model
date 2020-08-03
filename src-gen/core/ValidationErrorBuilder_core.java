/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Error Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.ValidationErrorBuilder_core#getMessage_java_lang_String_ <em>Message java lang String </em>}</li>
 *   <li>{@link core.ValidationErrorBuilder_core#getSourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference <em>Source With Construct software amazon awscdk core Construct As Reference</em>}</li>
 *   <li>{@link core.ValidationErrorBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.ValidationErrorBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.ValidationErrorBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.ValidationErrorBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getValidationErrorBuilder_core()
 * @model
 * @generated
 */
public interface ValidationErrorBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Message java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message java lang String </em>' attribute.
	 * @see #setMessage_java_lang_String_(String)
	 * @see core.CorePackage#getValidationErrorBuilder_core_Message_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getMessage_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.ValidationErrorBuilder_core#getMessage_java_lang_String_ <em>Message java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message java lang String </em>' attribute.
	 * @see #getMessage_java_lang_String_()
	 * @generated
	 */
	void setMessage_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Source With Construct software amazon awscdk core Construct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source With Construct software amazon awscdk core Construct As Reference</em>' attribute.
	 * @see #setSourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference(String)
	 * @see core.CorePackage#getValidationErrorBuilder_core_SourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference()
	 * @model
	 * @generated
	 */
	String getSourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference();

	/**
	 * Sets the value of the '{@link core.ValidationErrorBuilder_core#getSourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference <em>Source With Construct software amazon awscdk core Construct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source With Construct software amazon awscdk core Construct As Reference</em>' attribute.
	 * @see #getSourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference()
	 * @generated
	 */
	void setSourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.ValidationError"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getValidationErrorBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.ValidationError" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getValidationErrorBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.ValidationErrorBuilder_core#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see core.CorePackage#getValidationErrorBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.ValidationErrorBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see core.CorePackage#getValidationErrorBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.ValidationErrorBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ValidationErrorBuilder_core
