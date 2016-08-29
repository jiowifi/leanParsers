import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String location_name;
	public String privacy;
	public String organizer_description;
	public String description;
	public String end_time;
	public String schedule_published_on;
	public String type;
	public int id;
	public String email;
	public String organizer_name;
	public String code_of_conduct;
	public VersionModel _version;
	public String start_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String topic;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String logo;
	public String name;

	public RootModel(String background_image, String location_name, String privacy, String organizer_description, String description, String end_time, String schedule_published_on, String type, int id, String email, String organizer_name, String code_of_conduct, VersionModel version, String start_time, CopyrightModel copyright, CreatorModel creator, String topic, String timezone, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String state, String logo, String name) {

		this.background_image = background_image;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.description = description;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.id = id;
		this.email = email;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.start_time = start_time;
		this._copyright = copyright;
		this._creator = creator;
		this.topic = topic;
		this.timezone = timezone;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.logo = logo;
		this.name = name;

	}

}