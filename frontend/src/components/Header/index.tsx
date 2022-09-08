import logo from '../../assets/img/logo.svg'
import './styles.css';

function Header() {
    return (
        <header>
            <div className="meta-logo-container">
                <img src={logo} alt="Meta Sales" />
                <h1>Meta Sales</h1>
                <p>
                    Desenvolvido por
                    <a href="https://github.com/jeffsouza01"> Jefferson Souza</a>
                </p>
            </div>
        </header>
    )
}

export default Header