import React, { Component } from 'react';
import Button from 'react-bootstrap/Button';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import Form from 'react-bootstrap/Form';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Route, Switch, withRouter } from 'react-router-dom'
import Home from './Home';
import SignIn from './SignIn';
import SignUp from './SignUp';
import { FormControl } from 'react-bootstrap';



class NavBar extends Component {

    constructor(props){
        super(props);

        this.state = {
            departure: '',
            arrival: ''
        }
    }

    handleChange = (event) => {
        this.setState({
            [event.target.name]: event.target.value 

        })
        console.log(this.state)
    }

    handleSearch = (event) => {
        alert("You searched for " + this.state.departure +" and arrival is " + this.state.arrival);
        event.preventDefault();

    }

    handleRoute = route => () => {
        this.props.history.push({ pathname: route });
    };

    render() {
        return (
            <div>
                <Navbar bg="dark" variant="dark">
                    <Nav.Link onClick={this.handleRoute("/")}>
                        <Navbar.Brand>Ensi-Airlines</Navbar.Brand>
                    </Nav.Link>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="mr-auto">

                            <Nav.Link onClick={this.handleRoute("/SignUp")}>
                                Sign Up
                            </Nav.Link>
                            <Nav.Link onClick = {this.handleRoute("/SignIn")}>
                                Sign In
                            </Nav.Link>
                        </Nav>
                        <Form inline>
                            <FormControl 
                                type="text" placeholder="Departure" className="mr-sm-2" 
                                name = "departure"
                                onChange = {this.handleChange}
                                value = {this.state.departure}
                            />
                            <FormControl 
                                type="text" placeholder="Arrival" className="mr-sm-2"
                                name = "arrival"
                                onChange = {this.handleChange}
                                value = {this.state.arrival} 
                            />
                            <Button variant="outline-success" onClick={this.handleSearch}>
                                Search
                            </Button>
                        </Form>
                    </Navbar.Collapse>
                </Navbar>

                <Switch>
                    <Route exact path='/' Component={Home} />
                    <Route exact path='/SignUp' Component={SignUp} />
                    <Route exact path='/SignIn' Component={SignIn} />
                </Switch>
            </div>

        )
    }
}

export default withRouter(NavBar);