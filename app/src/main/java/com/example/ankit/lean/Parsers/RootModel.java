import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String timezone;
	public String type;
	public String end_time;
	public String email;
	public String name;
	public String description;
	public String logo;
	public String topic;
	public String location_name;
	public int id;
	public String background_image;
	public String code_of_conduct;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String organizer_name;
	public String privacy;
	public String schedule_published_on;

	public RootModel(CopyrightModel copyright, String timezone, String type, String end_time, String email, String name, String description, String logo, String topic, String location_name, int id, String background_image, String code_of_conduct, String state, Call_for_papersModel call_for_papers, VersionModel version, String start_time, String organizer_description, ArrayList<Social_linksModel> social_links, CreatorModel creator, String organizer_name, String privacy, String schedule_published_on) {

		this._copyright = copyright;
		this.timezone = timezone;
		this.type = type;
		this.end_time = end_time;
		this.email = email;
		this.name = name;
		this.description = description;
		this.logo = logo;
		this.topic = topic;
		this.location_name = location_name;
		this.id = id;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;

	}

}