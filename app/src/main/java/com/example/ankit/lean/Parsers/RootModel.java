import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String type;
	public String timezone;
	public String organizer_description;
	public String location_name;
	public String state;
	public String end_time;
	public String privacy;
	public int id;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String background_image;
	public String schedule_published_on;
	public String email;
	public String topic;
	public String description;
	public String code_of_conduct;
	public String logo;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String start_time;

	public RootModel(String organizer_name, String type, String timezone, String organizer_description, String location_name, String state, String end_time, String privacy, int id, String name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, CreatorModel creator, String background_image, String schedule_published_on, String email, String topic, String description, String code_of_conduct, String logo, CopyrightModel copyright, VersionModel version, String start_time) {

		this.organizer_name = organizer_name;
		this.type = type;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.state = state;
		this.end_time = end_time;
		this.privacy = privacy;
		this.id = id;
		this.name = name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.topic = topic;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._copyright = copyright;
		this._version = version;
		this.start_time = start_time;

	}

}