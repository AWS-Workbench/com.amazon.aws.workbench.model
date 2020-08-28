/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ProcessorFeaturesBuilder_rds;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Features Builder rds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ProcessorFeaturesBuilder_rdsImpl#getCoreCount_java_lang_Number_ <em>Core Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ProcessorFeaturesBuilder_rdsImpl#getThreadsPerCore_java_lang_Number_ <em>Threads Per Core java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ProcessorFeaturesBuilder_rdsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ProcessorFeaturesBuilder_rdsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ProcessorFeaturesBuilder_rdsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ProcessorFeaturesBuilder_rdsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorFeaturesBuilder_rdsImpl extends ServiceResourcesImpl implements ProcessorFeaturesBuilder_rds {
	/**
	 * The default value of the '{@link #getCoreCount_java_lang_Number_() <em>Core Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_COUNT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreCount_java_lang_Number_() <em>Core Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int coreCount_java_lang_Number_ = CORE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadsPerCore_java_lang_Number_() <em>Threads Per Core java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadsPerCore_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int THREADS_PER_CORE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreadsPerCore_java_lang_Number_() <em>Threads Per Core java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadsPerCore_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int threadsPerCore_java_lang_Number_ = THREADS_PER_CORE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.rds.ProcessorFeatures";

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
	protected ProcessorFeaturesBuilder_rdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.PROCESSOR_FEATURES_BUILDER_RDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCoreCount_java_lang_Number_() {
		return coreCount_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoreCount_java_lang_Number_(int newCoreCount_java_lang_Number_) {
		int oldCoreCount_java_lang_Number_ = coreCount_java_lang_Number_;
		coreCount_java_lang_Number_ = newCoreCount_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__CORE_COUNT_JAVA_LANG_NUMBER_,
					oldCoreCount_java_lang_Number_, coreCount_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThreadsPerCore_java_lang_Number_() {
		return threadsPerCore_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadsPerCore_java_lang_Number_(int newThreadsPerCore_java_lang_Number_) {
		int oldThreadsPerCore_java_lang_Number_ = threadsPerCore_java_lang_Number_;
		threadsPerCore_java_lang_Number_ = newThreadsPerCore_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__THREADS_PER_CORE_JAVA_LANG_NUMBER_,
					oldThreadsPerCore_java_lang_Number_, threadsPerCore_java_lang_Number_));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__VAR_NAME, oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__CORE_COUNT_JAVA_LANG_NUMBER_:
			return getCoreCount_java_lang_Number_();
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__THREADS_PER_CORE_JAVA_LANG_NUMBER_:
			return getThreadsPerCore_java_lang_Number_();
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__CORE_COUNT_JAVA_LANG_NUMBER_:
			setCoreCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__THREADS_PER_CORE_JAVA_LANG_NUMBER_:
			setThreadsPerCore_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__CORE_COUNT_JAVA_LANG_NUMBER_:
			setCoreCount_java_lang_Number_(CORE_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__THREADS_PER_CORE_JAVA_LANG_NUMBER_:
			setThreadsPerCore_java_lang_Number_(THREADS_PER_CORE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__CORE_COUNT_JAVA_LANG_NUMBER_:
			return coreCount_java_lang_Number_ != CORE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__THREADS_PER_CORE_JAVA_LANG_NUMBER_:
			return threadsPerCore_java_lang_Number_ != THREADS_PER_CORE_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__ADDITIONAL_CODE:
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
		result.append(" (coreCount_java_lang_Number_: ");
		result.append(coreCount_java_lang_Number_);
		result.append(", threadsPerCore_java_lang_Number_: ");
		result.append(threadsPerCore_java_lang_Number_);
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

} //ProcessorFeaturesBuilder_rdsImpl
