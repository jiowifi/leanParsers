import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String description;
	public VersionModel _version;
	public String email;
	public String location_name;
	public String type;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String state;
	public CreatorModel _creator;
	public String organizer_name;
	public String start_time;
	public String timezone;
	public String code_of_conduct;
	public String name;
	public String privacy;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String logo;

	public RootModel(CopyrightModel copyright, String description, VersionModel version, String email, String location_name, String type, String schedule_published_on, String end_time, String topic, ArrayList<Social_linksModel> social_links, int id, String state, CreatorModel creator, String organizer_name, String start_time, String timezone, String code_of_conduct, String name, String privacy, String organizer_description, Call_for_papersModel call_for_papers, String background_image, String logo) {

		this._copyright = copyright;
		this.description = description;
		this._version = version;
		this.email = email;
		this.location_name = location_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this.social_links = social_links;
		this.id = id;
		this.state = state;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.logo = logo;

	}

}