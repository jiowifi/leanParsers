import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String background_image;
	public VersionModel _version;
	public CreatorModel _creator;
	public String type;
	public int id;
	public String topic;
	public CopyrightModel _copyright;
	public String state;
	public String logo;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String privacy;
	public String schedule_published_on;
	public String location_name;
	public String name;
	public String organizer_description;
	public String organizer_name;
	public String email;

	public RootModel(String start_time, String background_image, VersionModel version, CreatorModel creator, String type, int id, String topic, CopyrightModel copyright, String state, String logo, String description, ArrayList<Social_linksModel> social_links, String timezone, String code_of_conduct, Call_for_papersModel call_for_papers, String end_time, String privacy, String schedule_published_on, String location_name, String name, String organizer_description, String organizer_name, String email) {

		this.start_time = start_time;
		this.background_image = background_image;
		this._version = version;
		this._creator = creator;
		this.type = type;
		this.id = id;
		this.topic = topic;
		this._copyright = copyright;
		this.state = state;
		this.logo = logo;
		this.description = description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.email = email;

	}

}