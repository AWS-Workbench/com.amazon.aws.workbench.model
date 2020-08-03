/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Conversion Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.SizeConversionOptionsBuilder_core#getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_ <em>Rounding software amazon awscdk core Size Rounding Behavior </em>}</li>
 *   <li>{@link core.SizeConversionOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.SizeConversionOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.SizeConversionOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.SizeConversionOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getSizeConversionOptionsBuilder_core()
 * @model
 * @generated
 */
public interface SizeConversionOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Rounding software amazon awscdk core Size Rounding Behavior </b></em>' attribute.
	 * The literals are from the enumeration {@link core.SizeRoundingBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounding software amazon awscdk core Size Rounding Behavior </em>' attribute.
	 * @see core.SizeRoundingBehavior
	 * @see #setRounding_software_amazon_awscdk_core_SizeRoundingBehavior_(SizeRoundingBehavior)
	 * @see core.CorePackage#getSizeConversionOptionsBuilder_core_Rounding_software_amazon_awscdk_core_SizeRoundingBehavior_()
	 * @model dataType="core.SizeRoundingBehavior"
	 * @generated
	 */
	SizeRoundingBehavior getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_();

	/**
	 * Sets the value of the '{@link core.SizeConversionOptionsBuilder_core#getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_ <em>Rounding software amazon awscdk core Size Rounding Behavior </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding software amazon awscdk core Size Rounding Behavior </em>' attribute.
	 * @see core.SizeRoundingBehavior
	 * @see #getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_()
	 * @generated
	 */
	void setRounding_software_amazon_awscdk_core_SizeRoundingBehavior_(SizeRoundingBehavior value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.SizeConversionOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getSizeConversionOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.SizeConversionOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getSizeConversionOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.SizeConversionOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getSizeConversionOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.SizeConversionOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getSizeConversionOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.SizeConversionOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SizeConversionOptionsBuilder_core
