import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String location_name;
	public String state;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String privacy;
	public String background_image;
	public String timezone;
	public String description;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String start_time;
	public CreatorModel _creator;
	public String name;
	public String email;
	public String organizer_name;
	public String end_time;
	public String type;
	public String schedule_published_on;

	public RootModel(String code_of_conduct, String location_name, String state, String topic, Call_for_papersModel call_for_papers, int id, String privacy, String background_image, String timezone, String description, String logo, ArrayList<Social_linksModel> social_links, String organizer_description, VersionModel version, CopyrightModel copyright, String start_time, CreatorModel creator, String name, String email, String organizer_name, String end_time, String type, String schedule_published_on) {

		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.state = state;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.privacy = privacy;
		this.background_image = background_image;
		this.timezone = timezone;
		this.description = description;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._version = version;
		this._copyright = copyright;
		this.start_time = start_time;
		this._creator = creator;
		this.name = name;
		this.email = email;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;

	}

}