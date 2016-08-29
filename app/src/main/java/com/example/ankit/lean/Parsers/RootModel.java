import java.util.ArrayList;

class RootModel {

	public String description;
	public String privacy;
	public String timezone;
	public String organizer_name;
	public String name;
	public String email;
	public String start_time;
	public CopyrightModel _copyright;
	public String state;
	public VersionModel _version;
	public String topic;
	public CreatorModel _creator;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String location_name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String code_of_conduct;
	public String schedule_published_on;
	public String background_image;
	public String organizer_description;

	public RootModel(String description, String privacy, String timezone, String organizer_name, String name, String email, String start_time, CopyrightModel copyright, String state, VersionModel version, String topic, CreatorModel creator, String type, ArrayList<Social_linksModel> social_links, String logo, String location_name, int id, Call_for_papersModel call_for_papers, String end_time, String code_of_conduct, String schedule_published_on, String background_image, String organizer_description) {

		this.description = description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.name = name;
		this.email = email;
		this.start_time = start_time;
		this._copyright = copyright;
		this.state = state;
		this._version = version;
		this.topic = topic;
		this._creator = creator;
		this.type = type;
		this.social_links = social_links;
		this.logo = logo;
		this.location_name = location_name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.organizer_description = organizer_description;

	}

}