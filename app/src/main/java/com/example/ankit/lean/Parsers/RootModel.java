import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public int id;
	public String location_name;
	public String background_image;
	public String topic;
	public String type;
	public String organizer_description;
	public String start_time;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String name;
	public String logo;
	public VersionModel _version;
	public String state;
	public String description;
	public String end_time;
	public String organizer_name;
	public String email;
	public String timezone;
	public String schedule_published_on;
	public String privacy;

	public RootModel(CopyrightModel copyright, int id, String location_name, String background_image, String topic, String type, String organizer_description, String start_time, String code_of_conduct, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, CreatorModel creator, String name, String logo, VersionModel version, String state, String description, String end_time, String organizer_name, String email, String timezone, String schedule_published_on, String privacy) {

		this._copyright = copyright;
		this.id = id;
		this.location_name = location_name;
		this.background_image = background_image;
		this.topic = topic;
		this.type = type;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.name = name;
		this.logo = logo;
		this._version = version;
		this.state = state;
		this.description = description;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.email = email;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;

	}

}