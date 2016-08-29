import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String organizer_name;
	public String email;
	public String start_time;
	public String description;
	public String end_time;
	public int id;
	public CreatorModel _creator;
	public String location_name;
	public String topic;
	public CopyrightModel _copyright;
	public String background_image;
	public String type;
	public String state;
	public String timezone;
	public VersionModel _version;
	public String code_of_conduct;
	public String schedule_published_on;
	public String organizer_description;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;

	public RootModel(Call_for_papersModel call_for_papers, String privacy, String organizer_name, String email, String start_time, String description, String end_time, int id, CreatorModel creator, String location_name, String topic, CopyrightModel copyright, String background_image, String type, String state, String timezone, VersionModel version, String code_of_conduct, String schedule_published_on, String organizer_description, String name, ArrayList<Social_linksModel> social_links, String logo) {

		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.email = email;
		this.start_time = start_time;
		this.description = description;
		this.end_time = end_time;
		this.id = id;
		this._creator = creator;
		this.location_name = location_name;
		this.topic = topic;
		this._copyright = copyright;
		this.background_image = background_image;
		this.type = type;
		this.state = state;
		this.timezone = timezone;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.name = name;
		this.social_links = social_links;
		this.logo = logo;

	}

}