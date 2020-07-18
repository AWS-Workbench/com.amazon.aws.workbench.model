/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acl Port Range Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.AclPortRangeBuilder_ec2#getFrom_java_lang_Number_ <em>From java lang Number </em>}</li>
 *   <li>{@link ec2.AclPortRangeBuilder_ec2#getTo_java_lang_Number_ <em>To java lang Number </em>}</li>
 *   <li>{@link ec2.AclPortRangeBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.AclPortRangeBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.AclPortRangeBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.AclPortRangeBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getAclPortRangeBuilder_ec2()
 * @model
 * @generated
 */
public interface AclPortRangeBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>From java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From java lang Number </em>' attribute.
	 * @see #setFrom_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getAclPortRangeBuilder_ec2_From_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getFrom_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.AclPortRangeBuilder_ec2#getFrom_java_lang_Number_ <em>From java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From java lang Number </em>' attribute.
	 * @see #getFrom_java_lang_Number_()
	 * @generated
	 */
	void setFrom_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>To java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To java lang Number </em>' attribute.
	 * @see #setTo_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getAclPortRangeBuilder_ec2_To_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getTo_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.AclPortRangeBuilder_ec2#getTo_java_lang_Number_ <em>To java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To java lang Number </em>' attribute.
	 * @see #getTo_java_lang_Number_()
	 * @generated
	 */
	void setTo_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.AclPortRange"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getAclPortRangeBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.AclPortRange" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getAclPortRangeBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.AclPortRangeBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getAclPortRangeBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.AclPortRangeBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getAclPortRangeBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.AclPortRangeBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AclPortRangeBuilder_ec2
