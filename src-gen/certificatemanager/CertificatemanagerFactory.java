/**
 */
package certificatemanager;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see certificatemanager.CertificatemanagerPackage
 * @generated
 */
public interface CertificatemanagerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CertificatemanagerFactory eINSTANCE = certificatemanager.impl.CertificatemanagerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Certificate Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificate Builder certificatemanager</em>'.
	 * @generated
	 */
	CertificateBuilder_certificatemanager createCertificateBuilder_certificatemanager();

	/**
	 * Returns a new object of class '<em>Dns Validated Certificate Props Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dns Validated Certificate Props Builder certificatemanager</em>'.
	 * @generated
	 */
	DnsValidatedCertificatePropsBuilder_certificatemanager createDnsValidatedCertificatePropsBuilder_certificatemanager();

	/**
	 * Returns a new object of class '<em>Certificate Props Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificate Props Builder certificatemanager</em>'.
	 * @generated
	 */
	CertificatePropsBuilder_certificatemanager createCertificatePropsBuilder_certificatemanager();

	/**
	 * Returns a new object of class '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * @generated
	 */
	DnsValidatedCertificateBuilder_certificatemanager createDnsValidatedCertificateBuilder_certificatemanager();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CertificatemanagerPackage getCertificatemanagerPackage();

} //CertificatemanagerFactory
