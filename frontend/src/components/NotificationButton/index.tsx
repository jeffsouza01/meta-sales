import icon from '../../assets/img/Notification-icon.svg';
import './styles.css';

function NotificationButton() {
    return(
            <div className="meta-red-btn">
                <img src={icon} alt="Icone de Notificar" />
            </div>
        )
  }
  
  export default NotificationButton;