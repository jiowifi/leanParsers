import java.util.ArrayList;

class RootModel {

	public String logo;
	public String timezone;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String state;
	public String background_image;
	public String end_time;
	public String location_name;
	public String organizer_description;
	public String organizer_name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public CreatorModel _creator;
	public String name;
	public String type;
	public String schedule_published_on;
	public String code_of_conduct;
	public String start_time;
	public String description;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String email;

	public RootModel(String logo, String timezone, VersionModel version, CopyrightModel copyright, String state, String background_image, String end_time, String location_name, String organizer_description, String organizer_name, String topic, ArrayList<Social_linksModel> social_links, String privacy, CreatorModel creator, String name, String type, String schedule_published_on, String code_of_conduct, String start_time, String description, int id, Call_for_papersModel call_for_papers, String email) {

		this.logo = logo;
		this.timezone = timezone;
		this._version = version;
		this._copyright = copyright;
		this.state = state;
		this.background_image = background_image;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.social_links = social_links;
		this.privacy = privacy;
		this._creator = creator;
		this.name = name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.description = description;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.email = email;

	}

}