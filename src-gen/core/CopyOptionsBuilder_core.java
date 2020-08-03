/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.CopyOptionsBuilder_core#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}</li>
 *   <li>{@link core.CopyOptionsBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_ <em>Follow software amazon awscdk core Symlink Follow Mode </em>}</li>
 *   <li>{@link core.CopyOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.CopyOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.CopyOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.CopyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getCopyOptionsBuilder_core()
 * @model
 * @generated
 */
public interface CopyOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclude java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude java lang String As List</em>' attribute.
	 * @see #setExclude_java_lang_String_AsList(String)
	 * @see core.CorePackage#getCopyOptionsBuilder_core_Exclude_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getExclude_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link core.CopyOptionsBuilder_core#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude java lang String As List</em>' attribute.
	 * @see #getExclude_java_lang_String_AsList()
	 * @generated
	 */
	void setExclude_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute.
	 * The literals are from the enumeration {@link core.SymlinkFollowMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follow software amazon awscdk core Symlink Follow Mode </em>' attribute.
	 * @see core.SymlinkFollowMode
	 * @see #setFollow_software_amazon_awscdk_core_SymlinkFollowMode_(SymlinkFollowMode)
	 * @see core.CorePackage#getCopyOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_()
	 * @model dataType="core.SymlinkFollowMode"
	 * @generated
	 */
	SymlinkFollowMode getFollow_software_amazon_awscdk_core_SymlinkFollowMode_();

	/**
	 * Sets the value of the '{@link core.CopyOptionsBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_ <em>Follow software amazon awscdk core Symlink Follow Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follow software amazon awscdk core Symlink Follow Mode </em>' attribute.
	 * @see core.SymlinkFollowMode
	 * @see #getFollow_software_amazon_awscdk_core_SymlinkFollowMode_()
	 * @generated
	 */
	void setFollow_software_amazon_awscdk_core_SymlinkFollowMode_(SymlinkFollowMode value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.CopyOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getCopyOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.CopyOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getCopyOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.CopyOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getCopyOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.CopyOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getCopyOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.CopyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CopyOptionsBuilder_core
