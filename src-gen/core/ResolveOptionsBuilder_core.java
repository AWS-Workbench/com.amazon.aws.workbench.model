/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.ResolveOptionsBuilder_core#getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference <em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>}</li>
 *   <li>{@link core.ResolveOptionsBuilder_core#getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>}</li>
 *   <li>{@link core.ResolveOptionsBuilder_core#getPreparing_java_lang_Boolean_ <em>Preparing java lang Boolean </em>}</li>
 *   <li>{@link core.ResolveOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.ResolveOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.ResolveOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.ResolveOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getResolveOptionsBuilder_core()
 * @model
 * @generated
 */
public interface ResolveOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>' attribute.
	 * @see #setResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference(String)
	 * @see core.CorePackage#getResolveOptionsBuilder_core_ResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference()
	 * @model
	 * @generated
	 */
	String getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference();

	/**
	 * Sets the value of the '{@link core.ResolveOptionsBuilder_core#getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference <em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>' attribute.
	 * @see #getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference()
	 * @generated
	 */
	void setResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Scope With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>' attribute.
	 * @see #setScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(String)
	 * @see core.CorePackage#getResolveOptionsBuilder_core_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @model
	 * @generated
	 */
	String getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Sets the value of the '{@link core.ResolveOptionsBuilder_core#getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>' attribute.
	 * @see #getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 */
	void setScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Preparing java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preparing java lang Boolean </em>' attribute.
	 * @see #setPreparing_java_lang_Boolean_(Boolean)
	 * @see core.CorePackage#getResolveOptionsBuilder_core_Preparing_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getPreparing_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link core.ResolveOptionsBuilder_core#getPreparing_java_lang_Boolean_ <em>Preparing java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparing java lang Boolean </em>' attribute.
	 * @see #getPreparing_java_lang_Boolean_()
	 * @generated
	 */
	void setPreparing_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.ResolveOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getResolveOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.ResolveOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getResolveOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.ResolveOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getResolveOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.ResolveOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getResolveOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.ResolveOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ResolveOptionsBuilder_core
