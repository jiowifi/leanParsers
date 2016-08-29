import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String background_image;
	public String end_time;
	public String topic;
	public String organizer_name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String organizer_description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String timezone;
	public String start_time;
	public String email;
	public String name;
	public String schedule_published_on;
	public String privacy;
	public String state;
	public CreatorModel _creator;
	public String location_name;
	public String type;
	public int id;

	public RootModel(ArrayList<Social_linksModel> social_links, String description, String background_image, String end_time, String topic, String organizer_name, String logo, Call_for_papersModel call_for_papers, VersionModel version, String organizer_description, String code_of_conduct, CopyrightModel copyright, String timezone, String start_time, String email, String name, String schedule_published_on, String privacy, String state, CreatorModel creator, String location_name, String type, int id) {

		this.social_links = social_links;
		this.description = description;
		this.background_image = background_image;
		this.end_time = end_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.timezone = timezone;
		this.start_time = start_time;
		this.email = email;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.state = state;
		this._creator = creator;
		this.location_name = location_name;
		this.type = type;
		this.id = id;

	}

}