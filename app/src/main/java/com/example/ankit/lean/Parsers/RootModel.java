import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String type;
	public CopyrightModel _copyright;
	public String topic;
	public String code_of_conduct;
	public String description;
	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public int id;
	public String privacy;
	public String end_time;
	public String location_name;
	public String background_image;
	public String schedule_published_on;
	public String email;
	public String logo;
	public String state;
	public String timezone;

	public RootModel(ArrayList<Social_linksModel> social_links, VersionModel version, CreatorModel creator, Call_for_papersModel call_for_papers, String name, String type, CopyrightModel copyright, String topic, String code_of_conduct, String description, String start_time, String organizer_description, String organizer_name, int id, String privacy, String end_time, String location_name, String background_image, String schedule_published_on, String email, String logo, String state, String timezone) {

		this.social_links = social_links;
		this._version = version;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.type = type;
		this._copyright = copyright;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.id = id;
		this.privacy = privacy;
		this.end_time = end_time;
		this.location_name = location_name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.logo = logo;
		this.state = state;
		this.timezone = timezone;

	}

}