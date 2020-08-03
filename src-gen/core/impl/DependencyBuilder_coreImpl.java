/**
 */
package core.impl;

import core.CorePackage;
import core.DependencyBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.DependencyBuilder_coreImpl#getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>}</li>
 *   <li>{@link core.impl.DependencyBuilder_coreImpl#getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>}</li>
 *   <li>{@link core.impl.DependencyBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.DependencyBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.DependencyBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.DependencyBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyBuilder_coreImpl extends MinimalEObjectImpl.Container implements DependencyBuilder_core {
	/**
	 * The default value of the '{@link #getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() <em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() <em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() <em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() <em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.Dependency";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DEPENDENCY_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(
			String newSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference) {
		String oldSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
		sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = newSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.DEPENDENCY_BUILDER_CORE__SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE,
					oldSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference,
					sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(
			String newTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference) {
		String oldTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
		targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = newTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.DEPENDENCY_BUILDER_CORE__TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE,
					oldTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference,
					targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEPENDENCY_BUILDER_CORE__VAR_NAME,
					oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEPENDENCY_BUILDER_CORE__IDENTIFIER,
					oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEPENDENCY_BUILDER_CORE__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.DEPENDENCY_BUILDER_CORE__SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			return getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();
		case CorePackage.DEPENDENCY_BUILDER_CORE__TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			return getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();
		case CorePackage.DEPENDENCY_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.DEPENDENCY_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.DEPENDENCY_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.DEPENDENCY_BUILDER_CORE__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CorePackage.DEPENDENCY_BUILDER_CORE__SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			setSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference((String) newValue);
			return;
		case CorePackage.DEPENDENCY_BUILDER_CORE__TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			setTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference((String) newValue);
			return;
		case CorePackage.DEPENDENCY_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.DEPENDENCY_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.DEPENDENCY_BUILDER_CORE__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CorePackage.DEPENDENCY_BUILDER_CORE__SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			setSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(
					SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.DEPENDENCY_BUILDER_CORE__TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			setTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(
					TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.DEPENDENCY_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.DEPENDENCY_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.DEPENDENCY_BUILDER_CORE__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CorePackage.DEPENDENCY_BUILDER_CORE__SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			return SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT == null
					? sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference != null
					: !SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT
							.equals(sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference);
		case CorePackage.DEPENDENCY_BUILDER_CORE__TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			return TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT == null
					? targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference != null
					: !TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT
							.equals(targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference);
		case CorePackage.DEPENDENCY_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.DEPENDENCY_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.DEPENDENCY_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.DEPENDENCY_BUILDER_CORE__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference: ");
		result.append(sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference);
		result.append(", targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference: ");
		result.append(targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //DependencyBuilder_coreImpl
