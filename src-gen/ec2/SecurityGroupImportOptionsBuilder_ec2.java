/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group Import Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}</li>
 *   <li>{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getMutable_java_lang_Boolean_ <em>Mutable java lang Boolean </em>}</li>
 *   <li>{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getSecurityGroupImportOptionsBuilder_ec2()
 * @model
 * @generated
 */
public interface SecurityGroupImportOptionsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow All Outbound java lang Boolean </em>' attribute.
	 * @see #setAllowAllOutbound_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getSecurityGroupImportOptionsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowAllOutbound_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow All Outbound java lang Boolean </em>' attribute.
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowAllOutbound_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Mutable java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutable java lang Boolean </em>' attribute.
	 * @see #setMutable_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getSecurityGroupImportOptionsBuilder_ec2_Mutable_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getMutable_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getMutable_java_lang_Boolean_ <em>Mutable java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutable java lang Boolean </em>' attribute.
	 * @see #getMutable_java_lang_Boolean_()
	 * @generated
	 */
	void setMutable_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.SecurityGroupImportOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getSecurityGroupImportOptionsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.SecurityGroupImportOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getSecurityGroupImportOptionsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getSecurityGroupImportOptionsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getSecurityGroupImportOptionsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SecurityGroupImportOptionsBuilder_ec2
