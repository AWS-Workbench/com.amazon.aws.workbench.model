/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Principal Opts Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.ServicePrincipalOptsBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}</li>
 *   <li>{@link iam.ServicePrincipalOptsBuilder_iam#getRegion_java_lang_String_ <em>Region java lang String </em>}</li>
 *   <li>{@link iam.ServicePrincipalOptsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.ServicePrincipalOptsBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.ServicePrincipalOptsBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.ServicePrincipalOptsBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getServicePrincipalOptsBuilder_iam()
 * @model
 * @generated
 */
public interface ServicePrincipalOptsBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions java lang String java lang Object As Map</em>' attribute.
	 * @see #setConditions_java_lang_String__java_lang_Object_AsMap(String)
	 * @see iam.IamPackage#getServicePrincipalOptsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap()
	 * @model
	 * @generated
	 */
	String getConditions_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Sets the value of the '{@link iam.ServicePrincipalOptsBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions java lang String java lang Object As Map</em>' attribute.
	 * @see #getConditions_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 */
	void setConditions_java_lang_String__java_lang_Object_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region java lang String </em>' attribute.
	 * @see #setRegion_java_lang_String_(String)
	 * @see iam.IamPackage#getServicePrincipalOptsBuilder_iam_Region_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRegion_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.ServicePrincipalOptsBuilder_iam#getRegion_java_lang_String_ <em>Region java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region java lang String </em>' attribute.
	 * @see #getRegion_java_lang_String_()
	 * @generated
	 */
	void setRegion_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.ServicePrincipalOpts"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getServicePrincipalOptsBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.ServicePrincipalOpts" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getServicePrincipalOptsBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.ServicePrincipalOptsBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getServicePrincipalOptsBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.ServicePrincipalOptsBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getServicePrincipalOptsBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.ServicePrincipalOptsBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ServicePrincipalOptsBuilder_iam
