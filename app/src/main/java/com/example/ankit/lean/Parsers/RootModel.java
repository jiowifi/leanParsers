import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String privacy;
	public String code_of_conduct;
	public String organizer_description;
	public String state;
	public String email;
	public String logo;
	public String end_time;
	public VersionModel _version;
	public String start_time;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String timezone;
	public String organizer_name;
	public String description;
	public String type;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public int id;
	public String schedule_published_on;

	public RootModel(String location_name, String privacy, String code_of_conduct, String organizer_description, String state, String email, String logo, String end_time, VersionModel version, String start_time, String background_image, Call_for_papersModel call_for_papers, String topic, String timezone, String organizer_name, String description, String type, String name, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, CreatorModel creator, int id, String schedule_published_on) {

		this.location_name = location_name;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.state = state;
		this.email = email;
		this.logo = logo;
		this.end_time = end_time;
		this._version = version;
		this.start_time = start_time;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.description = description;
		this.type = type;
		this.name = name;
		this.social_links = social_links;
		this._copyright = copyright;
		this._creator = creator;
		this.id = id;
		this.schedule_published_on = schedule_published_on;

	}

}