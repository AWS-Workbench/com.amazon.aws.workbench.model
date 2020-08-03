/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.TagBuilder_core#getApplyToLaunchedInstances_java_lang_Boolean_ <em>Apply To Launched Instances java lang Boolean </em>}</li>
 *   <li>{@link core.TagBuilder_core#getExcludeResourceTypes_java_lang_String_AsList <em>Exclude Resource Types java lang String As List</em>}</li>
 *   <li>{@link core.TagBuilder_core#getIncludeResourceTypes_java_lang_String_AsList <em>Include Resource Types java lang String As List</em>}</li>
 *   <li>{@link core.TagBuilder_core#getPriority_java_lang_Number_ <em>Priority java lang Number </em>}</li>
 *   <li>{@link core.TagBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.TagBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.TagBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.TagBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getTagBuilder_core()
 * @model
 * @generated
 */
public interface TagBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply To Launched Instances java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Launched Instances java lang Boolean </em>' attribute.
	 * @see #setApplyToLaunchedInstances_java_lang_Boolean_(Boolean)
	 * @see core.CorePackage#getTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getApplyToLaunchedInstances_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link core.TagBuilder_core#getApplyToLaunchedInstances_java_lang_Boolean_ <em>Apply To Launched Instances java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Launched Instances java lang Boolean </em>' attribute.
	 * @see #getApplyToLaunchedInstances_java_lang_Boolean_()
	 * @generated
	 */
	void setApplyToLaunchedInstances_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude Resource Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Resource Types java lang String As List</em>' attribute.
	 * @see #setExcludeResourceTypes_java_lang_String_AsList(String)
	 * @see core.CorePackage#getTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getExcludeResourceTypes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link core.TagBuilder_core#getExcludeResourceTypes_java_lang_String_AsList <em>Exclude Resource Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Resource Types java lang String As List</em>' attribute.
	 * @see #getExcludeResourceTypes_java_lang_String_AsList()
	 * @generated
	 */
	void setExcludeResourceTypes_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Include Resource Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Resource Types java lang String As List</em>' attribute.
	 * @see #setIncludeResourceTypes_java_lang_String_AsList(String)
	 * @see core.CorePackage#getTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getIncludeResourceTypes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link core.TagBuilder_core#getIncludeResourceTypes_java_lang_String_AsList <em>Include Resource Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Resource Types java lang String As List</em>' attribute.
	 * @see #getIncludeResourceTypes_java_lang_String_AsList()
	 * @generated
	 */
	void setIncludeResourceTypes_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Priority java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority java lang Number </em>' attribute.
	 * @see #setPriority_java_lang_Number_(int)
	 * @see core.CorePackage#getTagBuilder_core_Priority_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getPriority_java_lang_Number_();

	/**
	 * Sets the value of the '{@link core.TagBuilder_core#getPriority_java_lang_Number_ <em>Priority java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority java lang Number </em>' attribute.
	 * @see #getPriority_java_lang_Number_()
	 * @generated
	 */
	void setPriority_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.Tag"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getTagBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.Tag" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getTagBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.TagBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getTagBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.TagBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getTagBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.TagBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // TagBuilder_core
