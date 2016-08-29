import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String timezone;
	public CreatorModel _creator;
	public String end_time;
	public String organizer_name;
	public String description;
	public String type;
	public String start_time;
	public String code_of_conduct;
	public String topic;
	public String privacy;
	public String schedule_published_on;
	public String state;
	public String email;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public CopyrightModel _copyright;
	public String background_image;
	public String logo;

	public RootModel(VersionModel version, String timezone, CreatorModel creator, String end_time, String organizer_name, String description, String type, String start_time, String code_of_conduct, String topic, String privacy, String schedule_published_on, String state, String email, String name, Call_for_papersModel call_for_papers, String location_name, String organizer_description, ArrayList<Social_linksModel> social_links, int id, CopyrightModel copyright, String background_image, String logo) {

		this._version = version;
		this.timezone = timezone;
		this._creator = creator;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.description = description;
		this.type = type;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.email = email;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.id = id;
		this._copyright = copyright;
		this.background_image = background_image;
		this.logo = logo;

	}

}