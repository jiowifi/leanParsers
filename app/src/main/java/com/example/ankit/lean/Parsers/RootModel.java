import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String topic;
	public String organizer_description;
	public String timezone;
	public String organizer_name;
	public String type;
	public String name;
	public int id;
	public String start_time;
	public String description;
	public String logo;
	public String location_name;
	public String end_time;
	public String privacy;
	public CreatorModel _creator;
	public VersionModel _version;

	public RootModel(String background_image, String state, ArrayList<Social_linksModel> social_links, String email, CopyrightModel copyright, String code_of_conduct, Call_for_papersModel call_for_papers, String schedule_published_on, String topic, String organizer_description, String timezone, String organizer_name, String type, String name, int id, String start_time, String description, String logo, String location_name, String end_time, String privacy, CreatorModel creator, VersionModel version) {

		this.background_image = background_image;
		this.state = state;
		this.social_links = social_links;
		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.type = type;
		this.name = name;
		this.id = id;
		this.start_time = start_time;
		this.description = description;
		this.logo = logo;
		this.location_name = location_name;
		this.end_time = end_time;
		this.privacy = privacy;
		this._creator = creator;
		this._version = version;

	}

}