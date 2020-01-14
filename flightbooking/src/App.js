import React, { Component } from 'react';
import Home from './components/Home'
import './App.css';
import { BrowserRouter} from 'react-router-dom';
//import SignUp from './components/SignUp';
//import SignIn from './components/SignIn' ;

class App extends Component {

  render() {
    return (

      <div>
        <BrowserRouter>
          <Home />
        </BrowserRouter>
      </div>
    )
  }
}

export default App;
