/**
 */
package com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl;

import com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.CorePackage;
import com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder;

import com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.VpcBuilder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl#getStackName <em>Stack Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl#getTerminationProtection <em>Termination Protection</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl#getVpcbuilder <em>Vpcbuilder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackBuilderImpl extends MinimalEObjectImpl.Container implements StackBuilder {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackName() <em>Stack Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackName()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackName() <em>Stack Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackName()
	 * @generated
	 * @ordered
	 */
	protected String stackName = STACK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminationProtection() <em>Termination Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationProtection()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TERMINATION_PROTECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationProtection() <em>Termination Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationProtection()
	 * @generated
	 * @ordered
	 */
	protected Boolean terminationProtection = TERMINATION_PROTECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.Stack";

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
	 * The cached value of the '{@link #getVpcbuilder() <em>Vpcbuilder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcbuilder()
	 * @generated
	 * @ordered
	 */
	protected EList<VpcBuilder> vpcbuilder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.STACK_BUILDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_BUILDER__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStackName() {
		return stackName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackName(String newStackName) {
		String oldStackName = stackName;
		stackName = newStackName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_BUILDER__STACK_NAME, oldStackName,
					stackName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTerminationProtection() {
		return terminationProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminationProtection(Boolean newTerminationProtection) {
		Boolean oldTerminationProtection = terminationProtection;
		terminationProtection = newTerminationProtection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_BUILDER__TERMINATION_PROTECTION,
					oldTerminationProtection, terminationProtection));
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
	public void setGeneratedClassName(String newGeneratedClassName) {
		String oldGeneratedClassName = generatedClassName;
		generatedClassName = newGeneratedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_BUILDER__GENERATED_CLASS_NAME,
					oldGeneratedClassName, generatedClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_BUILDER__VAR_NAME, oldVarName,
					varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_BUILDER__IDENTIFIER, oldIdentifier,
					identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_BUILDER__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VpcBuilder> getVpcbuilder() {
		if (vpcbuilder == null) {
			vpcbuilder = new EObjectContainmentEList<VpcBuilder>(VpcBuilder.class, this,
					CorePackage.STACK_BUILDER__VPCBUILDER);
		}
		return vpcbuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CorePackage.STACK_BUILDER__VPCBUILDER:
			return ((InternalEList<?>) getVpcbuilder()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.STACK_BUILDER__DESCRIPTION:
			return getDescription();
		case CorePackage.STACK_BUILDER__STACK_NAME:
			return getStackName();
		case CorePackage.STACK_BUILDER__TERMINATION_PROTECTION:
			return getTerminationProtection();
		case CorePackage.STACK_BUILDER__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.STACK_BUILDER__VAR_NAME:
			return getVarName();
		case CorePackage.STACK_BUILDER__IDENTIFIER:
			return getIdentifier();
		case CorePackage.STACK_BUILDER__ADDITIONAL_CODE:
			return getAdditionalCode();
		case CorePackage.STACK_BUILDER__VPCBUILDER:
			return getVpcbuilder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CorePackage.STACK_BUILDER__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CorePackage.STACK_BUILDER__STACK_NAME:
			setStackName((String) newValue);
			return;
		case CorePackage.STACK_BUILDER__TERMINATION_PROTECTION:
			setTerminationProtection((Boolean) newValue);
			return;
		case CorePackage.STACK_BUILDER__GENERATED_CLASS_NAME:
			setGeneratedClassName((String) newValue);
			return;
		case CorePackage.STACK_BUILDER__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.STACK_BUILDER__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.STACK_BUILDER__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		case CorePackage.STACK_BUILDER__VPCBUILDER:
			getVpcbuilder().clear();
			getVpcbuilder().addAll((Collection<? extends VpcBuilder>) newValue);
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
		case CorePackage.STACK_BUILDER__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CorePackage.STACK_BUILDER__STACK_NAME:
			setStackName(STACK_NAME_EDEFAULT);
			return;
		case CorePackage.STACK_BUILDER__TERMINATION_PROTECTION:
			setTerminationProtection(TERMINATION_PROTECTION_EDEFAULT);
			return;
		case CorePackage.STACK_BUILDER__GENERATED_CLASS_NAME:
			setGeneratedClassName(GENERATED_CLASS_NAME_EDEFAULT);
			return;
		case CorePackage.STACK_BUILDER__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.STACK_BUILDER__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.STACK_BUILDER__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		case CorePackage.STACK_BUILDER__VPCBUILDER:
			getVpcbuilder().clear();
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
		case CorePackage.STACK_BUILDER__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CorePackage.STACK_BUILDER__STACK_NAME:
			return STACK_NAME_EDEFAULT == null ? stackName != null : !STACK_NAME_EDEFAULT.equals(stackName);
		case CorePackage.STACK_BUILDER__TERMINATION_PROTECTION:
			return TERMINATION_PROTECTION_EDEFAULT == null ? terminationProtection != null
					: !TERMINATION_PROTECTION_EDEFAULT.equals(terminationProtection);
		case CorePackage.STACK_BUILDER__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.STACK_BUILDER__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.STACK_BUILDER__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.STACK_BUILDER__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		case CorePackage.STACK_BUILDER__VPCBUILDER:
			return vpcbuilder != null && !vpcbuilder.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", stackName: ");
		result.append(stackName);
		result.append(", terminationProtection: ");
		result.append(terminationProtection);
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

} //StackBuilderImpl
